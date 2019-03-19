
public class TestRequest {
	
	RequestListener listener;
	
	public TestRequest(RequestListener listener) {
		this.listener = listener;
	}
	
	public interface RequestListener{
		void requestDone(String json);
	}
	 public void doRequest() {
		 listener.requestDone("Test Json");
	 }
}
