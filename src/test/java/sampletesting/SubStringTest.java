package sampletesting;

public class SubStringTest {

	public static void main(String[] args) {

		String str = "Request has been sent to Service Gateway fb0627sgw2020.edcharman.com\"."
				+ " Further processing updates shall be sent to the email address\"abhishek.singh18@harman.com\"."
				+ " Your unique identifer for this request is \"BulkUpload_381\" .";

		SubStringTest obj = new SubStringTest();
		System.out.println(obj.subStringTestFn(str));
	}

	public String subStringTestFn(String str) {

		String[] subStr = str.split(" ");
		String strObj = null;
		for (String st : subStr) {
			if (st.contains("BulkUpload")) {
				strObj = st;
			}
		}
		return strObj.substring(1, strObj.length() - 1);

	}
}
