import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	    public static void main(String[] args) throws IOException {
		            File file = new File("a.out");
			            FileOutputStream outputStream = new FileOutputStream(file, true);

				            for (int i = 0; i < 100000; i++) {

						                outputStream.write("hello world\n".getBytes());
								            outputStream.flush();

									                try {
												                Thread.sleep(10L);
														            } catch (Exception e) {
																                    e.printStackTrace();
																		                }
											        }

					            outputStream.close();
						        }

}

