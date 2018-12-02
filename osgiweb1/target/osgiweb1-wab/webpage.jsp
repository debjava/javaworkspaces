<!doctype html>
  <head>
    <title>Sample page for Ehcache Issue</title>
  </head>
<!-- Beginning of Relevent javascript functions -->  
  <script>
  
    function login()
    {
        var timestamp = new Date();
        var ajaxReq = getXmlHttpRequest();
        //var serverUrl = "http://localhost:8080/webrnd/webrnd?name="+name+"&pass="+pwd+"&timestamp="+timestamp.getTime();
        var serverUrl = "/osgiweb/osgiweb?timestamp="+timestamp.getTime();
        var pingStatus = processSynchronousPing( ajaxReq , serverUrl );
        document.getElementById("resultId").value = pingStatus;
    }
    
    function processAsynchronousPing(ajaxReq,serverUrl)
    {
        ajaxReq.onreadystatechange=function()
        {
            if (ajaxReq.readyState==4 && ajaxReq.status==200)
            {
                var textData = ajaxReq.responseText;
                //alert(textData);
            }
        }
        ajaxReq.open("POST",serverUrl,true);//For Asynchronous call
        ajaxReq.send();//For Asynchronous call
    }

    function processSynchronousPing(ajaxReq,serverUrl)
    {
        var pingStatus = false;
        ajaxReq.onreadystatechange=function()
        {
            if (ajaxReq.readyState==4 && ajaxReq.status==200)
            {
                var textData = ajaxReq.responseText;
                if( textData != "" )
                {
                    pingStatus = textData;
                }
                else
                {
                    pingStatus = false;
                }
            }
        }
        ajaxReq.open("GET",serverUrl,false);//For synchronous call
        ajaxReq.send(null);//For synchronous call
        return pingStatus;
    }
    
    function getXmlHttpRequest()
    {
        var xmlhttp;
        if (window.XMLHttpRequest) 
        {
            // code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp = new XMLHttpRequest();
        }
        else 
        {
            // code for IE6, IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        return xmlhttp;
    }

  </script>
<!-- Beginning of Relevent javascript functions -->
  
  <body>
    <h1>Sample page for Ehcache Issue</h1>
    <form action="/pos" method="POST">
            <table border="0">
            <tr>
                <td>
                    <fieldset>
                        <legend>Test &nbsp;</legend>
						<table>
						<tr>
                            <td/>
                            <td><input type="button" name="Test" value="Test" onclick="login();"/></td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
                
                <td>
                    <fieldset>
                        <legend>Result &nbsp;</legend>
                        <table>
                            <tr>
                                <td>
                                    <textarea id="resultId" rows="17" cols="100">
                                    </textarea>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
                
            </tr>
            
        </table>
     </form>
  </body>
</html>
