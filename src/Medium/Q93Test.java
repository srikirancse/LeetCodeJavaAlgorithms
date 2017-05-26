package Medium;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Srikiran Sistla on 5/20/2017.
 */
@RunWith(Arquillian.class)
public class Q93Test {
    @org.junit.Test
    public void restoreIpAddresses() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Q93.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
