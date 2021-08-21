package Common;

import com.ipaylinks.upsmock.Dao.UpsRequest;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class parseXmlUtils {


	public final static String REQUEST_TRACKID = "TrackID";
	public final static String REQUEST_TRACKREQUEST = "TrackRequest";
	public final static String ID = "ID";


	public static UpsRequest xmlToBean(String  xml) {
		Document document=null;
		try{
			document = DocumentHelper.parseText(xml);
		}catch (DocumentException e){
			e.printStackTrace();
		}
		Element rootElm=document.getRootElement();
		String userId = rootElm.attribute( "USERID" ).getValue();
		List nodes = rootElm.elements(REQUEST_TRACKID);
		List<String> IDs=new ArrayList<>();
		for (Iterator it = nodes.iterator(); it.hasNext(); ) {
			Element elm = (Element) it.next();
			String id=elm.attributeValue(ID);
			IDs.add( id );
		}
		UpsRequest u  = new UpsRequest(userId,IDs);

		System.out.println(u);
		return u;
	}


	public static void main(String[] args)
	{
		String xmlvar = "<TrackRequest USERID=\"530OPUAS5217\"><TrackID ID=\"9200190273562618482140\"></TrackID><TrackID ID=\"9200190273562618482287\"></TrackID><TrackID ID=\"9200190273562618482348\"></TrackID><TrackID ID=\"9200190273562618574791\"></TrackID><TrackID ID=\"9200190273562618482249\"></TrackID><TrackID ID=\"9200190273562619341644\"></TrackID><TrackID ID=\"9200190273562619342986\"></TrackID></TrackRequest>";
		xmlToBean( xmlvar );
	}
}
