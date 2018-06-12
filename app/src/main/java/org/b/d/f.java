package org.b.d;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.b.b.b;

class f
{
  private HttpURLConnection aBv;
  private String charset;
  private Map<String, String> gDj;
  private String rQi = null;
  private String url;
  private boolean vKA = false;
  private Long vKB = null;
  private Long vKC = null;
  private j vKw;
  private e vKx;
  private e vKy;
  private byte[] vKz = null;
  
  public f(j paramj, String paramString)
  {
    this.vKw = paramj;
    this.url = paramString;
    this.vKx = new e();
    this.vKy = new e();
    this.gDj = new HashMap();
  }
  
  private byte[] cKA()
  {
    if (this.vKz != null) {
      return this.vKz;
    }
    if (this.rQi != null) {}
    for (Object localObject = this.rQi;; localObject = this.vKy.cKz()) {
      try
      {
        localObject = ((String)localObject).getBytes(cKv());
        return (byte[])localObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new b("Unsupported Charset: " + cKv(), localUnsupportedEncodingException);
      }
    }
  }
  
  private void i(HttpURLConnection paramHttpURLConnection)
  {
    Iterator localIterator = this.gDj.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      String str = (String)localIterator.next();
      paramHttpURLConnection.setRequestProperty(str, (String)this.gDj.get(str));
    }
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    this.gDj.put(paramString1, paramString2);
  }
  
  public e cKs()
  {
    try
    {
      e locale = new e();
      locale.adU(new URL(this.url).getQuery());
      locale.a(this.vKx);
      return locale;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new b("Malformed URL", localMalformedURLException);
    }
  }
  
  public j cKt()
  {
    return this.vKw;
  }
  
  public String cKu()
  {
    Object localObject2 = this.vKx;
    Object localObject1 = this.url;
    org.b.g.d.j(localObject1, "Cannot append to null URL");
    localObject2 = ((e)localObject2).cKz();
    if (((String)localObject2).equals("")) {
      return (String)localObject1;
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject1));
    if (((String)localObject1).indexOf('?') != -1) {}
    for (localObject1 = "&";; localObject1 = Character.valueOf('?')) {
      return localStringBuilder.append(localObject1).toString() + (String)localObject2;
    }
  }
  
  public String cKv()
  {
    if (this.charset == null) {
      return Charset.defaultCharset().name();
    }
    return this.charset;
  }
  
  /* Error */
  public g cKw()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 203	org/b/d/f:cKu	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   9: ifnonnull +38 -> 47
    //   12: aload_0
    //   13: getfield 36	org/b/d/f:vKA	Z
    //   16: ifeq +187 -> 203
    //   19: ldc -49
    //   21: astore_1
    //   22: ldc -47
    //   24: aload_1
    //   25: invokestatic 215	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: pop
    //   29: aload_0
    //   30: new 138	java/net/URL
    //   33: dup
    //   34: aload_2
    //   35: invokespecial 139	java/net/URL:<init>	(Ljava/lang/String;)V
    //   38: invokevirtual 219	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   41: checkcast 123	java/net/HttpURLConnection
    //   44: putfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   47: aload_0
    //   48: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   51: aload_0
    //   52: getfield 42	org/b/d/f:vKw	Lorg/b/d/j;
    //   55: invokevirtual 222	org/b/d/j:name	()Ljava/lang/String;
    //   58: invokevirtual 225	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: getfield 38	org/b/d/f:vKB	Ljava/lang/Long;
    //   65: ifnull +17 -> 82
    //   68: aload_0
    //   69: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   72: aload_0
    //   73: getfield 38	org/b/d/f:vKB	Ljava/lang/Long;
    //   76: invokevirtual 231	java/lang/Long:intValue	()I
    //   79: invokevirtual 235	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   82: aload_0
    //   83: getfield 40	org/b/d/f:vKC	Ljava/lang/Long;
    //   86: ifnull +17 -> 103
    //   89: aload_0
    //   90: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   93: aload_0
    //   94: getfield 40	org/b/d/f:vKC	Ljava/lang/Long;
    //   97: invokevirtual 231	java/lang/Long:intValue	()I
    //   100: invokevirtual 238	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   103: aload_0
    //   104: aload_0
    //   105: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   108: invokespecial 240	org/b/d/f:i	(Ljava/net/HttpURLConnection;)V
    //   111: aload_0
    //   112: getfield 42	org/b/d/f:vKw	Lorg/b/d/j;
    //   115: getstatic 243	org/b/d/j:vKK	Lorg/b/d/j;
    //   118: invokevirtual 244	org/b/d/j:equals	(Ljava/lang/Object;)Z
    //   121: ifne +16 -> 137
    //   124: aload_0
    //   125: getfield 42	org/b/d/f:vKw	Lorg/b/d/j;
    //   128: getstatic 247	org/b/d/j:vKJ	Lorg/b/d/j;
    //   131: invokevirtual 244	org/b/d/j:equals	(Ljava/lang/Object;)Z
    //   134: ifeq +57 -> 191
    //   137: aload_0
    //   138: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   141: astore_1
    //   142: aload_0
    //   143: invokespecial 249	org/b/d/f:cKA	()[B
    //   146: astore_2
    //   147: aload_1
    //   148: ldc -5
    //   150: aload_2
    //   151: arraylength
    //   152: invokestatic 254	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   155: invokevirtual 127	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload_1
    //   159: ldc_w 256
    //   162: invokevirtual 260	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   165: ifnonnull +13 -> 178
    //   168: aload_1
    //   169: ldc_w 256
    //   172: ldc_w 262
    //   175: invokevirtual 127	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload_1
    //   179: iconst_1
    //   180: invokevirtual 266	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   183: aload_1
    //   184: invokevirtual 270	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   187: aload_2
    //   188: invokevirtual 276	java/io/OutputStream:write	([B)V
    //   191: new 278	org/b/d/g
    //   194: dup
    //   195: aload_0
    //   196: getfield 205	org/b/d/f:aBv	Ljava/net/HttpURLConnection;
    //   199: invokespecial 280	org/b/d/g:<init>	(Ljava/net/HttpURLConnection;)V
    //   202: areturn
    //   203: ldc_w 282
    //   206: astore_1
    //   207: goto -185 -> 22
    //   210: astore_1
    //   211: new 284	org/b/b/a
    //   214: dup
    //   215: aload_1
    //   216: invokespecial 287	org/b/b/a:<init>	(Ljava/lang/Exception;)V
    //   219: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	f
    //   21	186	1	localObject1	Object
    //   210	6	1	localException	Exception
    //   4	184	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	19	210	java/lang/Exception
    //   22	47	210	java/lang/Exception
    //   47	82	210	java/lang/Exception
    //   82	103	210	java/lang/Exception
    //   103	137	210	java/lang/Exception
    //   137	178	210	java/lang/Exception
    //   178	191	210	java/lang/Exception
    //   191	203	210	java/lang/Exception
  }
  
  public e cKx()
  {
    return this.vKy;
  }
  
  public String cKy()
  {
    return this.url.replaceAll("\\?.*", "").replace("\\:\\d{4}", "");
  }
  
  public void gD(String paramString1, String paramString2)
  {
    this.vKx.vKv.add(new d(paramString1, paramString2));
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public String toString()
  {
    return String.format("@Request(%s %s)", new Object[] { cKt(), getUrl() });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/org/b/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */