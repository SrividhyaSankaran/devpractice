package devpractice.Exceptions;

import java.io.IOException;

public class TestException {

	public void m1() throws IOException{
	    throw new IOException("Checked Exception - IO Exception");
    }
}
