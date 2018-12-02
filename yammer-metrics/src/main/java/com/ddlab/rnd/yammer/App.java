package com.ddlab.rnd.yammer;

import java.util.concurrent.TimeUnit;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;


/**
 * Hello world!
 *
 */
public class App 
{
	final MetricRegistry metrics = new MetricRegistry();
	
	public void show() throws Exception {
        
        int c = 10;
        for( int i = 0 ; i < 10 ; i++ ) {
        	c = c * (i+1);
        	TimeUnit.MILLISECONDS.sleep(100);
        }
        
	}
	
	public void doIt()  throws Exception {
		ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).build();
		reporter.start(1, TimeUnit.NANOSECONDS);
		Timer tempTimer = metrics.timer(MetricRegistry.name(App.class, "Temp"));
		final Timer.Context context = tempTimer.time();
		show();
		context.stop();
	}
	
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        
        new App().doIt();
    }
}
