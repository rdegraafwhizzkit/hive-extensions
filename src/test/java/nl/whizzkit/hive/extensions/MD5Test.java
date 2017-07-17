package nl.whizzkit.hive.extensions;

import junit.framework.Assert;

import org.apache.hadoop.io.Text;
import org.junit.Test;

@SuppressWarnings("unused")
public class MD5Test
{

    @Test
    public void testUDF()
    {
        MD5 md5 = new MD5();
        Assert.assertEquals("e57fe021cf3a70868342895b8df79491", md5.evaluate(new Text("MD5 Hash")).toString());
    }

    @Test
    public void testUDFNullCheck()
    {
        MD5 md5 = new MD5();
        Assert.assertNull(md5.evaluate(null));
    }
}