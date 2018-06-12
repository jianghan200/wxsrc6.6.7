package com.tencent.mm.pluginsdk.ui.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class q
{
  static Pattern qUr = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
  String ben;
  String fFQ;
  String qUo;
  String qUp;
  int qUq;
  
  public q(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.qUo = "";
    this.qUp = "";
    this.qUq = -1;
    this.ben = "/";
    this.fFQ = "";
    paramString = qUr.matcher(paramString);
    String str;
    if (paramString.matches())
    {
      str = paramString.group(1);
      if (str != null) {
        this.qUo = str.toLowerCase();
      }
      str = paramString.group(2);
      if (str != null) {
        this.fFQ = str;
      }
      str = paramString.group(3);
      if (str != null) {
        this.qUp = str;
      }
      str = paramString.group(4);
      if ((str == null) || (str.length() <= 0)) {}
    }
    for (;;)
    {
      try
      {
        this.qUq = Integer.parseInt(str);
        paramString = paramString.group(5);
        if ((paramString != null) && (paramString.length() > 0))
        {
          if (paramString.charAt(0) == '/') {
            this.ben = paramString;
          }
        }
        else
        {
          if ((this.qUq != 443) || (!this.qUo.equals(""))) {
            break label256;
          }
          this.qUo = "https";
          if (this.qUo.equals("")) {
            this.qUo = "http";
          }
          return;
        }
      }
      catch (NumberFormatException paramString)
      {
        throw new Exception("Bad port");
      }
      this.ben = ("/" + paramString);
      continue;
      throw new Exception("Bad address");
      label256:
      if (this.qUq == -1) {
        if (this.qUo.equals("https")) {
          this.qUq = 443;
        } else {
          this.qUq = 80;
        }
      }
    }
  }
  
  public final String toString()
  {
    String str2 = "";
    String str1;
    if ((this.qUq == 443) || (!this.qUo.equals("https")))
    {
      str1 = str2;
      if (this.qUq != 80)
      {
        str1 = str2;
        if (!this.qUo.equals("http")) {}
      }
    }
    else
    {
      str1 = ":" + Integer.toString(this.qUq);
    }
    str2 = "";
    if (this.fFQ.length() > 0) {
      str2 = this.fFQ + "@";
    }
    return this.qUo + "://" + str2 + this.qUp + str1 + this.ben;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */