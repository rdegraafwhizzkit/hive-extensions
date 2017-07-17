package nl.whizzkit.hive.extensions;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

@Description(
        name = "MD5",
        value = "Returns md5 hex sum of the input text x, where x is whatever you give it (STRING)",
        extended = "select md5('world');"
)
public class MD5 extends UDF
{
    @SuppressWarnings("WeakerAccess")
    public Text evaluate(Text input)
    {
        return input == null ? null : new Text(DigestUtils.md5Hex(input.toString()));
    }
}
