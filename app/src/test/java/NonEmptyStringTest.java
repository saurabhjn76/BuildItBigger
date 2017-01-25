
/**
 * Created by saurabh on 24/1/17.
 */

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.AndroidException;
import android.util.Log;
import android.util.Pair;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class NonEmptyStringTest extends AndroidTestCase {


    public void runTest()  {
        //assertThat(5==5, is(true));
        String joke=null;
        EndpointsAsyncTask endpointAsyncTask= new EndpointsAsyncTask();
        endpointAsyncTask.execute(new Pair<Context, String>(getContext(),"None"));

      try {
          joke =endpointAsyncTask.get();
          Log.d("TESTCASE","Success");
      } catch (InterruptedException e) {
          e.printStackTrace();
      } catch (ExecutionException e) {
          e.printStackTrace();
      }
      Log.println(Log.DEBUG,"CASE",joke);
     // assertNotNull(joke);

            assertEquals("EQU",getContext().toString());



    }
   /* @Test
    public void testSomething() {

        assertEquals(false, true);
    }*/


}