package com.tencent.mm.plugin.emoji.e;

import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d
{
  public static d ifo;
  public boolean ifp = false;
  private Pattern ifq = Pattern.compile("_\\d");
  
  public static d aDL()
  {
    if (ifo == null) {}
    try
    {
      ifo = new d();
      return ifo;
    }
    finally {}
  }
  
  public final void zg(String paramString)
  {
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      paramString = paramString.listFiles();
      if ((paramString != null) && (paramString.length > 0))
      {
        int j = paramString.length;
        int i = 0;
        if (i < j)
        {
          Object localObject = paramString[i];
          if (this.ifp)
          {
            if (((File)localObject).isDirectory()) {
              zg(((File)localObject).getPath());
            }
            for (;;)
            {
              i += 1;
              break;
              String str = ((File)localObject).getName();
              if ((this.ifq.matcher(str).find()) || (str.startsWith("temp"))) {
                ((File)localObject).delete();
              }
            }
          }
          x.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "stop run");
        }
      }
    }
  }
  
  public final void zh(String paramString)
  {
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      paramString = paramString.listFiles();
      if ((paramString != null) && (paramString.length > 0))
      {
        int j = paramString.length;
        int i = 0;
        if (i < j)
        {
          Object localObject = paramString[i];
          if (((File)localObject).isDirectory()) {
            zh(((File)localObject).getPath());
          }
          for (;;)
          {
            i += 1;
            break;
            ((File)localObject).getName();
            ((File)localObject).delete();
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */