package com.tencent.mm.vfs;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Comparable<b>
{
  public final Uri aMJ;
  private a.c uSo = null;
  
  public b(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException("uri == null");
    }
    String str = paramUri.getPath();
    Uri localUri = paramUri;
    if (str != null)
    {
      str = d.i(str, false, false);
      localUri = paramUri;
      if (!paramUri.getPath().equals(str)) {
        localUri = paramUri.buildUpon().path(str).build();
      }
    }
    this.aMJ = localUri;
  }
  
  private b(Uri paramUri, String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("name == null");
    }
    if (paramUri == null) {
      paramUri = new Uri.Builder().path(paramString);
    }
    for (;;)
    {
      paramString = paramUri.build();
      paramUri = paramString;
      if (paramString.getPath() != null)
      {
        localObject = d.i(paramString.getPath(), false, false);
        paramUri = paramString;
        if (!paramString.getPath().equals(localObject)) {
          paramUri = paramString.buildUpon().path((String)localObject).build();
        }
      }
      this.aMJ = paramUri;
      return;
      Object localObject = paramUri.buildUpon();
      paramUri = (Uri)localObject;
      if (!paramString.isEmpty())
      {
        ((Uri.Builder)localObject).appendPath(paramString);
        paramUri = (Uri)localObject;
      }
    }
  }
  
  public b(b paramb, String paramString) {}
  
  public b(File paramFile, String paramString)
  {
    this(a.abO(paramFile.getPath()), paramString);
  }
  
  public b(String paramString)
  {
    this(a.abO(paramString));
  }
  
  public final boolean a(b paramb)
  {
    a.c localc = cBU();
    paramb = paramb.cBU();
    if ((!localc.valid()) || (!paramb.valid())) {}
    while (localc.uSi != paramb.uSi) {
      return false;
    }
    return localc.uSi.gl(localc.path, paramb.path);
  }
  
  public final a.c cBU()
  {
    this.uSo = a.cBR().a(this.aMJ, this.uSo);
    return this.uSo;
  }
  
  public final Uri cBV()
  {
    String str = this.aMJ.getPath();
    int i = str.length();
    int j = str.lastIndexOf('/');
    if ((j == -1) || (str.charAt(i - 1) == '/')) {
      return null;
    }
    if ((str.indexOf('/') == j) && (str.charAt(0) == '/')) {}
    for (str = str.substring(0, j + 1);; str = str.substring(0, j)) {
      return this.aMJ.buildUpon().path(str).build();
    }
  }
  
  public final b cBW()
  {
    Uri localUri = cBV();
    if (localUri == null) {
      return null;
    }
    return new b(localUri);
  }
  
  public final Uri cBX()
  {
    int j = 0;
    String str1 = this.aMJ.getPath();
    int i = j;
    if (str1.length() > 0)
    {
      i = j;
      if (str1.charAt(0) == '/') {
        i = 1;
      }
    }
    if (i != 0) {
      return this.aMJ;
    }
    String str2 = this.aMJ.getPath();
    str1 = System.getProperty("user.dir");
    if (str2.isEmpty()) {}
    for (;;)
    {
      return this.aMJ.buildUpon().path(str1).build();
      str1 = str1 + '/' + str2;
    }
  }
  
  public final b[] cBY()
  {
    Object localObject1 = cBU();
    if (!((a.c)localObject1).valid()) {}
    do
    {
      return null;
      localObject2 = ((a.c)localObject1).uSi.abL(((a.c)localObject1).path);
    } while (localObject2 == null);
    localObject1 = new b[((List)localObject2).size()];
    Object localObject2 = ((List)localObject2).iterator();
    int i = 0;
    while (((Iterator)localObject2).hasNext())
    {
      localObject1[i] = new b(this, ((FileSystem.a)((Iterator)localObject2).next()).name);
      i += 1;
    }
    return (b[])localObject1;
  }
  
  public final boolean canRead()
  {
    a.c localc = cBU();
    if (!localc.valid()) {
      return false;
    }
    FileSystem localFileSystem = localc.uSi;
    String str = localFileSystem.abM(localc.path);
    if (str != null) {
      return new File(str).canRead();
    }
    return localFileSystem.abJ(localc.path);
  }
  
  public final boolean createNewFile()
  {
    a.c localc = cBU();
    if (!localc.valid()) {
      throw new FileNotFoundException("Cannot resolve path or URI: " + this.aMJ);
    }
    if (localc.uSi.abJ(localc.path)) {
      return false;
    }
    localc.uSi.mG(localc.path).close();
    return true;
  }
  
  public final boolean delete()
  {
    a.c localc = cBU();
    return (localc.valid()) && (localc.uSi.jy(localc.path));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    return this.aMJ.equals(((b)paramObject).aMJ);
  }
  
  public final boolean exists()
  {
    a.c localc = cBU();
    if (!localc.valid()) {
      return false;
    }
    return localc.uSi.abJ(localc.path);
  }
  
  public final String getName()
  {
    String str = this.aMJ.getPath();
    int i = str.lastIndexOf("/");
    if (i < 0) {
      return str;
    }
    return str.substring(i + 1, str.length());
  }
  
  public final int hashCode()
  {
    return this.aMJ.toString().hashCode() ^ 0x12D591;
  }
  
  public final boolean isDirectory()
  {
    Object localObject = cBU();
    if (!((a.c)localObject).valid()) {}
    do
    {
      return false;
      localObject = ((a.c)localObject).uSi.abK(((a.c)localObject).path);
    } while ((localObject == null) || (!((FileSystem.a)localObject).uRT));
    return true;
  }
  
  public final boolean isFile()
  {
    Object localObject = cBU();
    if (!((a.c)localObject).valid()) {}
    do
    {
      return false;
      localObject = ((a.c)localObject).uSi.abK(((a.c)localObject).path);
    } while ((localObject == null) || (((FileSystem.a)localObject).uRT));
    return true;
  }
  
  public final long lastModified()
  {
    Object localObject = cBU();
    if (!((a.c)localObject).valid()) {}
    do
    {
      return 0L;
      localObject = ((a.c)localObject).uSi.abK(((a.c)localObject).path);
    } while (localObject == null);
    return ((FileSystem.a)localObject).uRS;
  }
  
  public final long length()
  {
    Object localObject = cBU();
    if (!((a.c)localObject).valid()) {}
    do
    {
      return 0L;
      localObject = ((a.c)localObject).uSi.abK(((a.c)localObject).path);
    } while (localObject == null);
    return ((FileSystem.a)localObject).size;
  }
  
  public final boolean mkdirs()
  {
    a.c localc = cBU();
    if (!localc.valid()) {
      return false;
    }
    return localc.uSi.mL(localc.path);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */