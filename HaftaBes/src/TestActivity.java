

public class TestActivity implements TestRequest.RequestListener {
	public void getUserName() {
		TestRequest testRequest = new TestRequest(this);
		testRequest.doRequest();
	}

	@Override
	public void requestDone(String json) {
		// TODO Auto-generated method stub
		System.out.println(json);
	}
	
	
}
