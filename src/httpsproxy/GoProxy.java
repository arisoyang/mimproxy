package httpsproxy;

import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;
import org.littleshoot.proxy.mitm.CertificateSniffingMitmManager;
import org.littleshoot.proxy.mitm.RootCertificateException;

public class GoProxy {

	public static void main(String[] args) throws RootCertificateException {

		CertificateSniffingMitmManager certifimanger = new CertificateSniffingMitmManager();

		HttpProxyServer server = DefaultHttpProxyServer.bootstrap().withPort(9090) // for
																					// both
																					// HTTP
																					// and
																					// HTTPS
				.withManInTheMiddle(certifimanger).start();

	}

}
