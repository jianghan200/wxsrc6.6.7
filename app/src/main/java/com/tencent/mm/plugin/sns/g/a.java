package com.tencent.mm.plugin.sns.g;

import com.tencent.mm.protocal.c.alh;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.protocal.c.dx;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  private static int MO(String paramString)
  {
    try
    {
      int i = bi.getInt(paramString, 0);
      return i;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AlbumBgHelper", "parserInt error " + paramString);
    }
    return 0;
  }
  
  public static cj MP(String paramString)
  {
    Map localMap = bl.z(paramString, "albumList");
    cj localcj = new cj();
    if (localMap != null)
    {
      localcj.jRj = nf((String)localMap.get(".albumList.$lang"));
      paramString = new dx();
      paramString.jPe = nf((String)localMap.get(".albumList.album.author.name"));
      paramString.bHD = nf((String)localMap.get(".albumList.album.author.title"));
      paramString.rej = nf((String)localMap.get(".albumList.album.author.description"));
      paramString.rei = nf((String)localMap.get(".albumList.album.author.quote"));
      Object localObject1 = new dy();
      Object localObject2 = p(localMap, ".albumList.album.author.icon.media");
      String str1 = (String)localMap.get(".albumList.album.author.icon.media.id");
      String str2 = (String)localMap.get(".albumList.album.author.icon.media.type");
      String str3 = (String)localMap.get(".albumList.album.author.icon.media.title");
      String str4 = (String)localMap.get(".albumList.album.author.icon.media.desc");
      String str5 = (String)localMap.get(".albumList.album.author.icon.media.url");
      String str6 = (String)localMap.get(".albumList.album.author.icon.media.private");
      String str7 = (String)localMap.get(".albumList.album.author.icon.media.thumb");
      String str8 = (String)localMap.get(".albumList.album.author.icon.media.url.$type");
      String str9 = (String)localMap.get(".albumList.album.author.icon.media.thumb.$type");
      ate localate = new ate();
      localate.ksA = nf(str1);
      localate.hcE = MO(str2);
      localate.bHD = nf(str3);
      localate.jOS = nf(str4);
      localate.jPK = nf(str5);
      localate.rVD = MO(str8);
      localate.rVE = nf(str7);
      localate.rVF = MO(str9);
      localate.rVG = MO(str6);
      localate.rVH = ((atg)localObject2);
      ((dy)localObject1).rel = localate;
      paramString.rek = ((dy)localObject1);
      localcj.rcL = paramString;
      int i = 0;
      localObject2 = new alh();
      if (i == 0) {
        localObject1 = ".albumList.album.groupList.group.name";
      }
      for (paramString = ".albumList.album.groupList.group.mediaList";; paramString = ".albumList.album.groupList.group" + i + ".mediaList")
      {
        localObject1 = (String)localMap.get(localObject1);
        if (localObject1 == null) {
          break label495;
        }
        ((alh)localObject2).jPe = nf((String)localObject1);
        ((alh)localObject2).ruA = q(localMap, paramString);
        localcj.rcM.add(localObject2);
        i += 1;
        break;
        localObject1 = ".albumList.album.groupList.group" + i + ".name";
      }
      label495:
      return localcj;
    }
    return localcj;
  }
  
  private static float ne(String paramString)
  {
    if (paramString == null) {
      return 0.0F;
    }
    try
    {
      float f = bi.getFloat(paramString, 0.0F);
      return f;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AlbumBgHelper", "parseFloat error " + paramString);
    }
    return 0.0F;
  }
  
  private static String nf(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private static atg p(Map<String, String> paramMap, String paramString)
  {
    String str2 = paramString + ".size.$width";
    String str1 = paramString + ".size.$height";
    Object localObject = paramString + ".size.$totalSize";
    paramString = (String)paramMap.get(str2);
    str1 = (String)paramMap.get(str1);
    paramMap = (String)paramMap.get(localObject);
    localObject = new atg();
    ((atg)localObject).rWv = 0.0F;
    ((atg)localObject).rWu = 0.0F;
    ((atg)localObject).rWw = 0.0F;
    if (paramString != null) {
      ((atg)localObject).rWu = ne(paramString);
    }
    if (str1 != null) {
      ((atg)localObject).rWv = ne(str1);
    }
    if (paramMap != null) {
      ((atg)localObject).rWw = ne(paramMap);
    }
    return (atg)localObject;
  }
  
  private static LinkedList<ate> q(Map<String, String> paramMap, String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    String str9;
    String str8;
    String str7;
    String str6;
    String str5;
    String str3;
    String str2;
    String str1;
    String str4;
    if (i != 0)
    {
      str9 = paramString + ".media" + i + ".id";
      str8 = paramString + ".media" + i + ".type";
      str7 = paramString + ".media" + i + ".title";
      str6 = paramString + ".media" + i + ".desc";
      str5 = paramString + ".media" + i + ".url";
      str3 = paramString + ".media" + i + ".thumb";
      str2 = paramString + ".media" + i + ".url.$type";
      str1 = paramString + ".media" + i + ".thumb.$type";
      str4 = paramString + ".media" + i + ".private";
    }
    for (Object localObject = paramString + ".media" + i;; localObject = paramString + ".media")
    {
      if ((str9 == null) || (str8 == null)) {
        break label795;
      }
      localObject = p(paramMap, (String)localObject);
      str9 = (String)paramMap.get(str9);
      str8 = (String)paramMap.get(str8);
      str7 = (String)paramMap.get(str7);
      str6 = (String)paramMap.get(str6);
      str5 = (String)paramMap.get(str5);
      str4 = (String)paramMap.get(str4);
      str3 = (String)paramMap.get(str3);
      str2 = (String)paramMap.get(str2);
      str1 = (String)paramMap.get(str1);
      if ((str9 == null) || (str8 == null)) {
        break label795;
      }
      ate localate = new ate();
      localate.ksA = nf(str9);
      localate.hcE = MO(str8);
      localate.bHD = nf(str7);
      localate.jOS = nf(str6);
      localate.jPK = nf(str5);
      localate.rVD = MO(str2);
      localate.rVE = nf(str3);
      localate.rVF = MO(str1);
      localate.rVG = MO(str4);
      localate.rVH = ((atg)localObject);
      localLinkedList.add(localate);
      i += 1;
      break;
      str9 = paramString + ".media.id";
      str8 = paramString + ".media.type";
      str7 = paramString + ".media.title";
      str6 = paramString + ".media.desc";
      str5 = paramString + ".media.url";
      str3 = paramString + ".media.thumb";
      str2 = paramString + ".media.url.$type";
      str1 = paramString + ".media.thumb.$type";
      str4 = paramString + ".media.private";
    }
    label795:
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */