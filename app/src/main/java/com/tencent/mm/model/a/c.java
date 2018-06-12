package com.tencent.mm.model.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class c
{
  b dDN = null;
  b dDO = null;
  
  public final boolean IU()
  {
    return this.dDN != null;
  }
  
  public final e iP(String paramString)
  {
    e locale1 = null;
    if (this.dDN != null) {
      locale1 = this.dDN.iP(paramString);
    }
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = locale1;
      if (this.dDO != null) {
        locale2 = this.dDO.iP(paramString);
      }
    }
    return locale2;
  }
  
  final void iQ(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.abtest.AbTestManager", "[Abtest] parse xml faild. xml is null.");
      return;
    }
    x.i("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML content:%s", new Object[] { paramString });
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      int j;
      Object localObject3;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("testcase");
        if (paramString == null) {
          break;
        }
        i = 0;
        if (i >= paramString.getLength()) {
          break;
        }
        localObject1 = new b();
        NodeList localNodeList = paramString.item(i).getChildNodes();
        int k = localNodeList.getLength();
        j = 0;
        if (j >= k) {
          break label632;
        }
        localObject3 = localNodeList.item(j);
        if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("testpoint")))
        {
          Object localObject4 = ((Node)localObject3).getAttributes();
          localObject2 = new e();
          if (localObject4 != null)
          {
            Object localObject5 = ((NamedNodeMap)localObject4).getNamedItem("id");
            if (localObject5 != null)
            {
              localObject5 = ((Node)localObject5).getNodeValue();
              x.d("MicroMsg.abtest.AbTestManager", "[Abtest] idValue:%s", new Object[] { localObject5 });
              ((e)localObject2).id = ((String)localObject5);
            }
            localObject4 = ((NamedNodeMap)localObject4).getNamedItem("reportid");
            if (localObject4 != null)
            {
              localObject4 = ((Node)localObject4).getNodeValue();
              x.d("MicroMsg.abtest.AbTestManager", "[Abtest] reportIdValue:%s", new Object[] { localObject4 });
              ((e)localObject2).dDP = ((String)localObject4);
            }
          }
          localObject3 = ((Node)localObject3).getTextContent();
          x.d("MicroMsg.abtest.AbTestManager", "[Abtest] casePointContent:%s", new Object[] { localObject3 });
          ((e)localObject2).value = ((String)localObject3);
          localObject3 = ((e)localObject2).id;
          ((b)localObject1).dDM.put(localObject3, localObject2);
        }
        else if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("verifymd5")))
        {
          localObject2 = ((Node)localObject3).getTextContent();
          x.d("MicroMsg.abtest.AbTestManager", "[Abtest] verifymd5Content:%s", new Object[] { localObject2 });
          ((b)localObject1).dDI = ((String)localObject2);
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML exception:%s", new Object[] { paramString.toString() });
        return;
      }
      if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("testcaseid")))
      {
        localObject2 = ((Node)localObject3).getTextContent();
        x.d("MicroMsg.abtest.AbTestManager", "[Abtest] testcaseidContent:%s", new Object[] { localObject2 });
        ((b)localObject1).dDJ = ((String)localObject2);
      }
      else if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("starttime")))
      {
        localObject2 = ((Node)localObject3).getTextContent();
        x.d("MicroMsg.abtest.AbTestManager", "[Abtest] starttimeContent:%s", new Object[] { localObject2 });
        ((b)localObject1).dDK = ((String)localObject2);
      }
      else if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("endtime")))
      {
        localObject2 = ((Node)localObject3).getTextContent();
        x.d("MicroMsg.abtest.AbTestManager", "[Abtest] endtimeContent:%s", new Object[] { localObject2 });
        ((b)localObject1).dDL = ((String)localObject2);
        break label674;
        label632:
        if ((!bi.oW(((b)localObject1).dDJ)) && ("0".equals(((b)localObject1).dDJ)))
        {
          this.dDO = ((b)localObject1);
          break label681;
        }
        this.dDN = ((b)localObject1);
        break label681;
      }
      label674:
      j += 1;
      continue;
      label681:
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */