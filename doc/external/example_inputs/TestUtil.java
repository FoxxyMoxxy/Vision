import edu.rice.cs.caper.vision.annotations.Evidence;
import java.util.List;

// Vision supports two types of evidence:
// 1. apicalls - API methods the code should invoke
// 2. types - datatypes of objects which invoke API methods

public class TestUtil {

    // NOTE: Vision only supports one synthesis task in a given
    // program at a time, so please comment out the rest.

    /* Read from a file */
    void add(List<String> items, String item) {
        { // Provide evidence within a separate block
            /// call:add
        } // Synthesized code will replace this block
    }   
}
