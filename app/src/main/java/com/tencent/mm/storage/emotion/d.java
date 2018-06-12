package com.tencent.mm.storage.emotion;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.bt.h;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class d
  extends i<EmojiInfo>
  implements g.a
{
  public static final String[] diD = { i.a(EmojiInfo.dhO, "EmojiInfo"), "CREATE INDEX IF NOT EXISTS emojiinfogrouptempindex  on EmojiInfo  (  groupId,temp )", "CREATE INDEX IF NOT EXISTS emojiinfogatalogindex  on EmojiInfo  (  catalog )" };
  private static int[] tcY = { 2, 4, 8 };
  public com.tencent.mm.sdk.e.e diF;
  
  public d(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, EmojiInfo.dhO, "EmojiInfo", null);
    this.diF = parame;
  }
  
  private int Dt(int paramInt)
  {
    int i = 0;
    int j = 0;
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.diF.b("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { String.valueOf(paramInt), "0" }, 2);
      paramInt = j;
      if (localCursor != null)
      {
        paramInt = j;
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          paramInt = localCursor.getInt(0);
        }
      }
      i = paramInt;
      if (localCursor != null)
      {
        localCursor.close();
        i = paramInt;
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(localException) });
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "[countProductId]Count ProductId fail." + localException.getMessage());
      return 0;
    }
    finally
    {
      if (localObject3 == null) {
        break label184;
      }
      ((Cursor)localObject3).close();
    }
    return i;
  }
  
  private boolean Dv(int paramInt)
  {
    return this.diF.delete("EmojiInfo", "catalog=?", new String[] { String.valueOf(paramInt) }) >= 0;
  }
  
  private static List<EmojiInfo> a(InputStream[] paramArrayOfInputStream)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int k;
      try
      {
        DocumentBuilder localDocumentBuilder = ((DocumentBuilderFactory)localObject).newDocumentBuilder();
        int i = 0;
        if (i <= 0)
        {
          localObject = paramArrayOfInputStream[i];
          if (localObject != null)
          {
            NodeList localNodeList1 = localDocumentBuilder.parse((InputStream)localObject).getDocumentElement().getElementsByTagName("catalog");
            int j = 0;
            if (j < localNodeList1.getLength())
            {
              localObject = (Element)localNodeList1.item(j);
              int m = Integer.decode(((Element)localObject).getAttribute("id")).intValue();
              NodeList localNodeList2 = ((Element)localObject).getElementsByTagName("emoji");
              k = 0;
              if (k < localNodeList2.getLength())
              {
                com.tencent.mm.plugin.emoji.d.aDh();
                EmojiInfo localEmojiInfo = new EmojiInfo(com.tencent.mm.plugin.emoji.d.aDi());
                localObject = (Element)localNodeList2.item(k);
                localEmojiInfo.field_md5 = ((Element)localObject).getAttribute("md5");
                if (!localEmojiInfo.cnB()) {
                  break label354;
                }
                localEmojiInfo.field_catalog = m;
                localEmojiInfo.field_groupId = String.valueOf(m);
                localEmojiInfo.field_name = ((Element)localObject).getAttribute("name");
                localEmojiInfo.field_type = Integer.decode(((Element)localObject).getAttribute("type")).intValue();
                localObject = ((Element)localObject).getFirstChild();
                if ((localObject instanceof CharacterData))
                {
                  localObject = ((CharacterData)localObject).getData();
                  if (localEmojiInfo.field_type != EmojiInfo.TYPE_TEXT) {
                    break label351;
                  }
                  localObject = new String(Base64.decode((String)localObject, 0));
                  localEmojiInfo.field_content = ((String)localObject);
                  localArrayList.add(localEmojiInfo);
                  break label354;
                }
                localObject = "";
                continue;
              }
              j += 1;
              continue;
            }
          }
          i += 1;
        }
        else
        {
          return localArrayList;
        }
      }
      catch (Exception paramArrayOfInputStream)
      {
        x.e("MicroMsg.emoji.EmojiInfoStorage", "parse xml error; " + paramArrayOfInputStream.getMessage());
      }
      label351:
      continue;
      label354:
      k += 1;
    }
  }
  
  private EmojiInfo b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      x.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      return null;
    }
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      x.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      paramString1 = null;
    }
    for (;;)
    {
      paramString1.field_state = EmojiInfo.tcP;
      if (!o(paramString1)) {
        break;
      }
      Xp("create_emoji_info_notify");
      return paramString1;
      EmojiInfo localEmojiInfo2 = Zy(paramString1);
      EmojiInfo localEmojiInfo1 = localEmojiInfo2;
      if (localEmojiInfo2 == null)
      {
        com.tencent.mm.plugin.emoji.d.aDh();
        localEmojiInfo1 = new EmojiInfo(com.tencent.mm.plugin.emoji.d.aDi());
        localEmojiInfo1.field_catalog = paramInt1;
      }
      localEmojiInfo1.field_md5 = paramString1;
      localEmojiInfo1.field_svrid = paramString2;
      localEmojiInfo1.field_type = paramInt2;
      localEmojiInfo1.field_size = paramInt3;
      localEmojiInfo1.field_state = EmojiInfo.tcN;
      localEmojiInfo1.field_reserved1 = null;
      localEmojiInfo1.field_reserved2 = null;
      localEmojiInfo1.field_app_id = paramString3;
      localEmojiInfo1.field_temp = 1;
      localEmojiInfo1.field_reserved4 = 0;
      paramString1 = localEmojiInfo1;
      if (!TextUtils.isEmpty(paramString4))
      {
        localEmojiInfo1.field_groupId = paramString4;
        paramString1 = localEmojiInfo1;
      }
    }
  }
  
  public final Cursor Du(int paramInt)
  {
    return this.diF.query("EmojiInfo", null, "catalog=? and temp=?", new String[] { String.valueOf(paramInt), "0" }, null, null, null);
  }
  
  public final boolean ZA(String paramString)
  {
    bool3 = false;
    bool2 = false;
    localObject2 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.diF.b("select * from EmojiInfo where md5=?", new String[] { paramString }, 2);
      boolean bool1 = bool2;
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject2 = localCursor;
        boolean bool4 = localCursor.moveToFirst();
        bool1 = bool2;
        if (bool4) {
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (localCursor != null)
      {
        localCursor.close();
        bool2 = bool1;
      }
    }
    catch (Exception localException)
    {
      localObject2 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "get judge is Exist EmojiInfo fail. md5 id is %s, err: %s", new Object[] { paramString, localException.getMessage() });
      bool2 = bool3;
      return false;
    }
    finally
    {
      if (localObject2 == null) {
        break label145;
      }
      ((Cursor)localObject2).close();
    }
    return bool2;
  }
  
  public final boolean ZB(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (!TextUtils.isEmpty(paramString)) {
      paramString = "groupId = '" + paramString + "'";
    }
    try
    {
      int i = this.diF.delete("EmojiInfo", paramString, null);
      bool1 = bool2;
      if (i >= 0) {
        bool1 = true;
      }
      return bool1;
    }
    catch (Exception paramString)
    {
      x.i("MicroMsg.emoji.EmojiInfoStorage", "Delete By ProductId fail." + paramString.getMessage());
    }
    return false;
  }
  
  /* Error */
  public final EmojiInfo Zy(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 339	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifne +12 -> 16
    //   7: aload_1
    //   8: invokevirtual 259	java/lang/String:length	()I
    //   11: bipush 32
    //   13: if_icmpeq +23 -> 36
    //   16: ldc 77
    //   18: ldc_w 341
    //   21: iconst_1
    //   22: anewarray 81	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: invokestatic 343	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aconst_null
    //   33: astore_3
    //   34: aload_3
    //   35: areturn
    //   36: aload_0
    //   37: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   40: ldc 25
    //   42: aconst_null
    //   43: ldc_w 345
    //   46: iconst_1
    //   47: anewarray 17	java/lang/String
    //   50: dup
    //   51: iconst_0
    //   52: aload_1
    //   53: aastore
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: iconst_2
    //   58: invokeinterface 348 9 0
    //   63: astore_2
    //   64: aload_2
    //   65: ifnull +127 -> 192
    //   68: aload_2
    //   69: astore_3
    //   70: aload_2
    //   71: invokeinterface 69 1 0
    //   76: ifeq +116 -> 192
    //   79: aload_2
    //   80: astore_3
    //   81: invokestatic 190	com/tencent/mm/plugin/emoji/d:aDh	()Lcom/tencent/mm/plugin/emoji/d;
    //   84: pop
    //   85: aload_2
    //   86: astore_3
    //   87: new 19	com/tencent/mm/storage/emotion/EmojiInfo
    //   90: dup
    //   91: invokestatic 193	com/tencent/mm/plugin/emoji/d:aDi	()Ljava/lang/String;
    //   94: invokespecial 194	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   97: astore_1
    //   98: aload_2
    //   99: astore_3
    //   100: aload_1
    //   101: aload_2
    //   102: invokevirtual 352	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   105: aload_1
    //   106: astore_3
    //   107: aload_2
    //   108: ifnull -74 -> 34
    //   111: aload_2
    //   112: invokeinterface 75 1 0
    //   117: aload_1
    //   118: areturn
    //   119: astore 4
    //   121: aconst_null
    //   122: astore_2
    //   123: aconst_null
    //   124: astore_1
    //   125: aload_2
    //   126: astore_3
    //   127: ldc 77
    //   129: ldc_w 354
    //   132: iconst_1
    //   133: anewarray 81	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: aload 4
    //   140: invokevirtual 355	java/lang/Exception:toString	()Ljava/lang/String;
    //   143: aastore
    //   144: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_1
    //   148: astore_3
    //   149: aload_2
    //   150: ifnull -116 -> 34
    //   153: aload_2
    //   154: invokeinterface 75 1 0
    //   159: aload_1
    //   160: areturn
    //   161: astore_1
    //   162: aconst_null
    //   163: astore_3
    //   164: aload_3
    //   165: ifnull +9 -> 174
    //   168: aload_3
    //   169: invokeinterface 75 1 0
    //   174: aload_1
    //   175: athrow
    //   176: astore_1
    //   177: goto -13 -> 164
    //   180: astore 4
    //   182: aconst_null
    //   183: astore_1
    //   184: goto -59 -> 125
    //   187: astore 4
    //   189: goto -64 -> 125
    //   192: aconst_null
    //   193: astore_1
    //   194: goto -89 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	d
    //   0	197	1	paramString	String
    //   63	91	2	localCursor	Cursor
    //   33	136	3	localObject	Object
    //   119	20	4	localException1	Exception
    //   180	1	4	localException2	Exception
    //   187	1	4	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   36	64	119	java/lang/Exception
    //   36	64	161	finally
    //   70	79	176	finally
    //   81	85	176	finally
    //   87	98	176	finally
    //   100	105	176	finally
    //   127	147	176	finally
    //   70	79	180	java/lang/Exception
    //   81	85	180	java/lang/Exception
    //   87	98	180	java/lang/Exception
    //   100	105	187	java/lang/Exception
  }
  
  /* Error */
  public final EmojiInfo Zz(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   4: ldc_w 358
    //   7: iconst_2
    //   8: anewarray 17	java/lang/String
    //   11: dup
    //   12: iconst_0
    //   13: aload_1
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: ldc 57
    //   19: aastore
    //   20: iconst_2
    //   21: invokeinterface 63 4 0
    //   26: astore_2
    //   27: aload_2
    //   28: astore_3
    //   29: aload_2
    //   30: invokeinterface 69 1 0
    //   35: ifeq +124 -> 159
    //   38: aload_2
    //   39: astore_3
    //   40: invokestatic 190	com/tencent/mm/plugin/emoji/d:aDh	()Lcom/tencent/mm/plugin/emoji/d;
    //   43: pop
    //   44: aload_2
    //   45: astore_3
    //   46: new 19	com/tencent/mm/storage/emotion/EmojiInfo
    //   49: dup
    //   50: invokestatic 193	com/tencent/mm/plugin/emoji/d:aDi	()Ljava/lang/String;
    //   53: invokespecial 194	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   56: astore_1
    //   57: aload_2
    //   58: astore_3
    //   59: aload_1
    //   60: aload_2
    //   61: invokevirtual 352	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   64: aload_1
    //   65: astore_3
    //   66: aload_2
    //   67: ifnull +11 -> 78
    //   70: aload_2
    //   71: invokeinterface 75 1 0
    //   76: aload_1
    //   77: astore_3
    //   78: aload_3
    //   79: areturn
    //   80: astore 4
    //   82: aconst_null
    //   83: astore_2
    //   84: aconst_null
    //   85: astore_1
    //   86: aload_2
    //   87: astore_3
    //   88: ldc 77
    //   90: new 95	java/lang/StringBuilder
    //   93: dup
    //   94: ldc_w 360
    //   97: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: aload 4
    //   102: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   105: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokestatic 114	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: aload_1
    //   115: astore_3
    //   116: aload_2
    //   117: ifnull -39 -> 78
    //   120: aload_2
    //   121: invokeinterface 75 1 0
    //   126: aload_1
    //   127: areturn
    //   128: astore_1
    //   129: aconst_null
    //   130: astore_3
    //   131: aload_3
    //   132: ifnull +9 -> 141
    //   135: aload_3
    //   136: invokeinterface 75 1 0
    //   141: aload_1
    //   142: athrow
    //   143: astore_1
    //   144: goto -13 -> 131
    //   147: astore 4
    //   149: aconst_null
    //   150: astore_1
    //   151: goto -65 -> 86
    //   154: astore 4
    //   156: goto -70 -> 86
    //   159: aconst_null
    //   160: astore_1
    //   161: goto -97 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	d
    //   0	164	1	paramString	String
    //   26	95	2	localCursor	Cursor
    //   28	108	3	localObject	Object
    //   80	21	4	localException1	Exception
    //   147	1	4	localException2	Exception
    //   154	1	4	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   0	27	80	java/lang/Exception
    //   0	27	128	finally
    //   29	38	143	finally
    //   40	44	143	finally
    //   46	57	143	finally
    //   59	64	143	finally
    //   88	114	143	finally
    //   29	38	147	java/lang/Exception
    //   40	44	147	java/lang/Exception
    //   46	57	147	java/lang/Exception
    //   59	64	154	java/lang/Exception
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final EmojiInfo a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    return b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramString4);
  }
  
  public final void a(Context paramContext, EmojiInfo paramEmojiInfo)
  {
    Object localObject;
    Context localContext;
    if ((paramEmojiInfo.field_catalog == EmojiInfo.tcD) || (paramEmojiInfo.field_catalog == EmojiInfo.tcG) || (paramEmojiInfo.field_catalog == EmojiInfo.tcF))
    {
      localObject = null;
      localContext = null;
    }
    for (;;)
    {
      try
      {
        paramContext = EmojiInfo.bt(paramContext, paramEmojiInfo.getName());
        if (paramContext == null) {
          break label257;
        }
        localContext = paramContext;
        localObject = paramContext;
        j = paramContext.available();
        i = j;
      }
      catch (IOException paramContext)
      {
        localObject = localContext;
        x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(paramContext) });
        if (localContext == null) {
          break label252;
        }
        try
        {
          localContext.close();
          i = 0;
        }
        catch (IOException paramContext)
        {
          x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(paramContext) });
          i = 0;
        }
        continue;
      }
      finally
      {
        if (localObject == null) {
          break label197;
        }
      }
      try
      {
        paramContext.close();
        i = j;
      }
      catch (IOException paramContext)
      {
        x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(paramContext) });
        i = j;
        continue;
      }
      if ((i != 0) && (i != paramEmojiInfo.field_size))
      {
        paramEmojiInfo.field_size = i;
        p(paramEmojiInfo);
      }
      return;
      try
      {
        ((InputStream)localObject).close();
        label197:
        throw paramContext;
      }
      catch (IOException paramEmojiInfo)
      {
        for (;;)
        {
          x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(paramEmojiInfo) });
        }
      }
      int i = com.tencent.mm.a.e.cm(paramEmojiInfo.mcn + paramEmojiInfo.Xh());
      continue;
      label252:
      i = 0;
      continue;
      label257:
      int j = 0;
    }
  }
  
  public final boolean at(LinkedList<String> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList failed. list is null");
      return false;
    }
    x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList list size :%d.", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UPDATE");
    localStringBuilder.append(" EmojiInfo ");
    localStringBuilder.append(" SET ");
    localStringBuilder.append("needupload");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.tcV);
    localStringBuilder.append(" where ");
    localStringBuilder.append("md5");
    localStringBuilder.append(" IN (");
    int i = 0;
    while (i < paramLinkedList.size())
    {
      localStringBuilder.append("'" + (String)paramLinkedList.get(i) + "'");
      if (i < paramLinkedList.size() - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    localStringBuilder.append(")");
    x.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
    return this.diF.fV("EmojiInfo", localStringBuilder.toString());
  }
  
  public final EmojiInfo b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    return b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, paramString3);
  }
  
  public final EmojiInfo c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    return b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, paramString3);
  }
  
  public final List<EmojiInfo> cnG()
  {
    ArrayList localArrayList = new ArrayList();
    int i = EmojiGroupInfo.tcz;
    int j = EmojiGroupInfo.tcA;
    int k = EmojiInfo.tcQ;
    Cursor localCursor = this.diF.b("select  * from EmojiInfo where catalog=?  or catalog=? and state!=? order by reserved3 asc", new String[] { String.valueOf(i), String.valueOf(j), String.valueOf(k) }, 2);
    if (localCursor.moveToFirst()) {
      do
      {
        com.tencent.mm.plugin.emoji.d.aDh();
        EmojiInfo localEmojiInfo = new EmojiInfo(com.tencent.mm.plugin.emoji.d.aDi());
        localEmojiInfo.d(localCursor);
        localArrayList.add(localEmojiInfo);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
  
  public final List<String> cnH()
  {
    localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    Object localObject4 = EmojiGroupInfo.tcA;
    try
    {
      localObject4 = this.diF.b("select md5 from EmojiInfo where catalog=?  order by reserved3 asc", new String[] { localObject4 }, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(((Cursor)localObject4).getString(0));
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "get download custom emoji MD5 list failed :%s", new Object[] { bi.i(localException) });
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label179;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final List<String> cnI()
  {
    localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    Object localObject4 = EmojiGroupInfo.tcA;
    String str = EmojiInfo.tcT;
    try
    {
      localObject4 = this.diF.b("select md5 from EmojiInfo where catalog=? and source=?", new String[] { localObject4, str }, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(((Cursor)localObject4).getString(0));
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "get download custom emoji MD5 list failed :%s", new Object[] { bi.i(localException) });
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label202;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final List<String> cnJ()
  {
    localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.diF.b("select md5 from EmojiInfo where catalog=? or temp=?", new String[] { "85", "2" }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localCursor;
            localObject3 = localCursor;
            localArrayList.add(localCursor.getString(0));
            localObject1 = localCursor;
            localObject3 = localCursor;
            bool = localCursor.moveToNext();
          } while (bool);
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "get need to sync emoji MD5 list failed :%s", new Object[] { bi.i(localException) });
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label168;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final int cnK()
  {
    int j = 0;
    int k = 0;
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.diF.rawQuery("select md5 from EmojiInfo where catalog=? or temp=?", new String[] { "85", "2" });
      int i = k;
      if (localCursor != null)
      {
        i = k;
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          i = localCursor.getCount();
        }
      }
      j = i;
      if (localCursor != null)
      {
        localCursor.close();
        j = i;
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "get need to sync emoji MD5 list failed :%s", new Object[] { bi.i(localException) });
      return 0;
    }
    finally
    {
      if (localObject3 == null) {
        break label155;
      }
      ((Cursor)localObject3).close();
    }
    return j;
  }
  
  public final ArrayList<String> cnL()
  {
    localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    int i = EmojiInfo.tcV;
    int j = EmojiGroupInfo.tcA;
    try
    {
      Cursor localCursor = this.diF.b("select md5 from EmojiInfo where needupload=? and catalog=?", new String[] { String.valueOf(i), String.valueOf(j) }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localCursor;
            localObject3 = localCursor;
            localArrayList.add(localCursor.getString(0));
            localObject1 = localCursor;
            localObject3 = localCursor;
            bool = localCursor.moveToNext();
          } while (bool);
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "get need upload emoji MD5 list failed :%s", new Object[] { bi.i(localException) });
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label191;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final int cnM()
  {
    int j = 0;
    int k = 0;
    localObject3 = null;
    localObject1 = null;
    int i = EmojiGroupInfo.tcA;
    try
    {
      Cursor localCursor = this.diF.b("select reserved3 from EmojiInfo where catalog=? order by reserved3 desc limit 1", new String[] { String.valueOf(i) }, 2);
      i = k;
      if (localCursor != null)
      {
        i = k;
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          i = localCursor.getInt(0);
        }
      }
      j = i;
      if (localCursor != null)
      {
        localCursor.close();
        j = i;
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "getCustomEmojiMaxIndex :%s", new Object[] { bi.i(localException) });
      return 0;
    }
    finally
    {
      if (localObject3 == null) {
        break label156;
      }
      ((Cursor)localObject3).close();
    }
    return j;
  }
  
  /* Error */
  public final ArrayList<EmojiInfo> cnN()
  {
    // Byte code:
    //   0: getstatic 466	com/tencent/mm/storage/emotion/EmojiGroupInfo:tcA	I
    //   3: istore_1
    //   4: getstatic 524	com/tencent/mm/storage/emotion/EmojiGroupInfo:tcB	I
    //   7: istore_2
    //   8: aload_0
    //   9: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   12: ldc_w 526
    //   15: iconst_2
    //   16: anewarray 17	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: iload_1
    //   22: invokestatic 55	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: iload_2
    //   29: invokestatic 55	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   32: aastore
    //   33: iconst_2
    //   34: invokeinterface 63 4 0
    //   39: astore 5
    //   41: aload 5
    //   43: ifnull +116 -> 159
    //   46: aload 5
    //   48: astore 4
    //   50: aload 5
    //   52: invokeinterface 69 1 0
    //   57: ifeq +102 -> 159
    //   60: aload 5
    //   62: astore 4
    //   64: new 125	java/util/ArrayList
    //   67: dup
    //   68: invokespecial 127	java/util/ArrayList:<init>	()V
    //   71: astore 6
    //   73: aload 5
    //   75: astore 4
    //   77: new 19	com/tencent/mm/storage/emotion/EmojiInfo
    //   80: dup
    //   81: invokespecial 527	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   84: astore 7
    //   86: aload 5
    //   88: astore 4
    //   90: aload 7
    //   92: aload 5
    //   94: invokevirtual 352	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   97: aload 5
    //   99: astore 4
    //   101: aload 7
    //   103: getfield 307	com/tencent/mm/storage/emotion/EmojiInfo:field_reserved4	I
    //   106: getstatic 530	com/tencent/mm/storage/emotion/EmojiInfo:tcW	I
    //   109: iand
    //   110: getstatic 530	com/tencent/mm/storage/emotion/EmojiInfo:tcW	I
    //   113: if_icmpeq +15 -> 128
    //   116: aload 5
    //   118: astore 4
    //   120: aload 6
    //   122: aload 7
    //   124: invokevirtual 512	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   127: pop
    //   128: aload 5
    //   130: astore 4
    //   132: aload 5
    //   134: invokeinterface 474 1 0
    //   139: istore_3
    //   140: iload_3
    //   141: ifne -68 -> 73
    //   144: aload 5
    //   146: ifnull +10 -> 156
    //   149: aload 5
    //   151: invokeinterface 75 1 0
    //   156: aload 6
    //   158: areturn
    //   159: aload 5
    //   161: ifnull +10 -> 171
    //   164: aload 5
    //   166: invokeinterface 75 1 0
    //   171: aconst_null
    //   172: areturn
    //   173: astore 6
    //   175: aconst_null
    //   176: astore 5
    //   178: aload 5
    //   180: astore 4
    //   182: ldc 77
    //   184: ldc_w 532
    //   187: iconst_1
    //   188: anewarray 81	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload 6
    //   195: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   198: aastore
    //   199: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: aload 5
    //   204: ifnull -33 -> 171
    //   207: aload 5
    //   209: invokeinterface 75 1 0
    //   214: goto -43 -> 171
    //   217: astore 5
    //   219: aconst_null
    //   220: astore 4
    //   222: aload 4
    //   224: ifnull +10 -> 234
    //   227: aload 4
    //   229: invokeinterface 75 1 0
    //   234: aload 5
    //   236: athrow
    //   237: astore 5
    //   239: goto -17 -> 222
    //   242: astore 6
    //   244: goto -66 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	d
    //   3	19	1	i	int
    //   7	22	2	j	int
    //   139	2	3	bool	boolean
    //   48	180	4	localCursor1	Cursor
    //   39	169	5	localCursor2	Cursor
    //   217	18	5	localObject1	Object
    //   237	1	5	localObject2	Object
    //   71	86	6	localArrayList	ArrayList
    //   173	21	6	localException1	Exception
    //   242	1	6	localException2	Exception
    //   84	39	7	localEmojiInfo	EmojiInfo
    // Exception table:
    //   from	to	target	type
    //   8	41	173	java/lang/Exception
    //   8	41	217	finally
    //   50	60	237	finally
    //   64	73	237	finally
    //   77	86	237	finally
    //   90	97	237	finally
    //   101	116	237	finally
    //   120	128	237	finally
    //   132	140	237	finally
    //   182	202	237	finally
    //   50	60	242	java/lang/Exception
    //   64	73	242	java/lang/Exception
    //   77	86	242	java/lang/Exception
    //   90	97	242	java/lang/Exception
    //   101	116	242	java/lang/Exception
    //   120	128	242	java/lang/Exception
    //   132	140	242	java/lang/Exception
  }
  
  public final boolean dt(List<String> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {
      return false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UPDATE");
    localStringBuilder.append(" EmojiInfo ");
    localStringBuilder.append(" SET ");
    localStringBuilder.append("catalog");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.tcB);
    localStringBuilder.append(",");
    localStringBuilder.append("source");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.tcS);
    localStringBuilder.append(",");
    localStringBuilder.append("needupload");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.tcU);
    localStringBuilder.append(" where ");
    localStringBuilder.append("md5");
    localStringBuilder.append(" IN (");
    int i = 0;
    while (i < paramList.size())
    {
      localStringBuilder.append("'" + (String)paramList.get(i) + "'");
      if (i < paramList.size() - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    localStringBuilder.append(")");
    x.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
    if (this.diF.fV("EmojiInfo", localStringBuilder.toString())) {
      Xp("delete_emoji_info_notify");
    }
    return true;
  }
  
  public final boolean du(List<String> paramList)
  {
    x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin topCustomEmojiByMd5");
    long l2 = System.currentTimeMillis();
    if ((paramList == null) || (paramList.size() <= 0))
    {
      x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] topCustomEmojiByMd5 failed. list is null");
      return false;
    }
    Object localObject1 = cnH();
    h localh = null;
    if ((this.diF instanceof h)) {
      localh = (h)this.diF;
    }
    for (long l1 = localh.dO(Thread.currentThread().getId());; l1 = -1L)
    {
      Object localObject2 = paramList.iterator();
      int j;
      for (int i = 1; ((Iterator)localObject2).hasNext(); i = j)
      {
        Object localObject3 = (String)((Iterator)localObject2).next();
        EmojiInfo localEmojiInfo = Zy((String)localObject3);
        j = i;
        if (localEmojiInfo != null)
        {
          j = i;
          if (!bi.oW(localEmojiInfo.Xh()))
          {
            localEmojiInfo.field_reserved3 = i;
            if (!((List)localObject1).isEmpty()) {
              ((List)localObject1).remove(localObject3);
            }
            j = i + 1;
            localObject3 = localEmojiInfo.wH();
            if (this.diF.replace("EmojiInfo", "md5", (ContentValues)localObject3) < 0L)
            {
              if (localh != null) {
                localh.gp(l1);
              }
              x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
              return false;
            }
          }
        }
      }
      if (!((List)localObject1).isEmpty())
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = Zy((String)((Iterator)localObject1).next());
          if ((localObject2 != null) && (!bi.oW(((EmojiInfo)localObject2).Xh())))
          {
            ((EmojiInfo)localObject2).field_reserved3 = i;
            i += 1;
            localObject2 = ((EmojiInfo)localObject2).wH();
            if (this.diF.replace("EmojiInfo", "md5", (ContentValues)localObject2) < 0L)
            {
              if (localh != null) {
                localh.gp(l1);
              }
              x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
              return false;
            }
          }
        }
      }
      if (localh != null) {
        localh.gp(l1);
      }
      l1 = System.currentTimeMillis();
      if (paramList == null) {}
      for (i = 0;; i = paramList.size())
      {
        x.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d succes. size:%d", new Object[] { Long.valueOf(l1 - l2), Integer.valueOf(i) });
        return true;
      }
    }
  }
  
  public final boolean dv(List<ta> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      x.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL failed. empty list");
      return false;
    }
    x.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL size:%d", new Object[] { Integer.valueOf(paramList.size()) });
    h localh = null;
    long l;
    if ((this.diF instanceof h))
    {
      localh = (h)this.diF;
      l = localh.dO(Thread.currentThread().getId());
      x.i("MicroMsg.emoji.EmojiInfoStorage", "surround updateEmojiURL in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int i = 0;
      while (i < paramList.size())
      {
        ta localta = (ta)paramList.get(i);
        EmojiInfo localEmojiInfo2 = Zy(localta.rwk);
        EmojiInfo localEmojiInfo1 = localEmojiInfo2;
        if (localEmojiInfo2 == null)
        {
          localEmojiInfo1 = new EmojiInfo();
          localEmojiInfo1.field_md5 = localta.rwk;
          localEmojiInfo1.field_catalog = EmojiInfo.tcB;
          x.i("MicroMsg.emoji.EmojiInfoStorage", "new emoji as received when updateEmoji url");
        }
        localEmojiInfo1.field_cdnUrl = localta.jPK;
        localEmojiInfo1.field_encrypturl = localta.rwm;
        localEmojiInfo1.field_aeskey = localta.rwn;
        localEmojiInfo1.field_designerID = localta.rwl;
        localEmojiInfo1.field_thumbUrl = localta.lPl;
        localEmojiInfo1.field_groupId = localta.rem;
        p(localEmojiInfo1);
        i += 1;
      }
      if (localh != null)
      {
        localh.gp(l);
        x.i("MicroMsg.emoji.EmojiInfoStorage", "end updateList transaction");
      }
      return true;
      l = -1L;
    }
  }
  
  /* Error */
  public final String getKey()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   4: ldc_w 674
    //   7: iconst_1
    //   8: anewarray 17	java/lang/String
    //   11: dup
    //   12: iconst_0
    //   13: ldc_w 676
    //   16: aastore
    //   17: iconst_2
    //   18: invokeinterface 63 4 0
    //   23: astore_2
    //   24: aload_2
    //   25: ifnull +67 -> 92
    //   28: aload_2
    //   29: astore_1
    //   30: aload_2
    //   31: invokeinterface 69 1 0
    //   36: ifeq +56 -> 92
    //   39: aload_2
    //   40: astore_1
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 481 2 0
    //   48: astore_3
    //   49: aload_2
    //   50: astore_1
    //   51: ldc 77
    //   53: new 95	java/lang/StringBuilder
    //   56: dup
    //   57: ldc_w 678
    //   60: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: aload_3
    //   64: invokestatic 681	com/tencent/mm/sdk/platformtools/bi:Xf	(Ljava/lang/String;)Ljava/lang/String;
    //   67: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload_3
    //   77: astore_1
    //   78: aload_2
    //   79: ifnull +11 -> 90
    //   82: aload_2
    //   83: invokeinterface 75 1 0
    //   88: aload_3
    //   89: astore_1
    //   90: aload_1
    //   91: areturn
    //   92: aload_2
    //   93: ifnull +9 -> 102
    //   96: aload_2
    //   97: invokeinterface 75 1 0
    //   102: invokestatic 687	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   105: invokestatic 691	com/tencent/mm/sdk/platformtools/bi:fP	(Landroid/content/Context;)Ljava/lang/String;
    //   108: astore_1
    //   109: aload_1
    //   110: invokestatic 339	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   113: ifne +118 -> 231
    //   116: aload_1
    //   117: invokevirtual 695	java/lang/String:getBytes	()[B
    //   120: invokestatic 701	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   123: astore_1
    //   124: ldc 77
    //   126: new 95	java/lang/StringBuilder
    //   129: dup
    //   130: ldc_w 703
    //   133: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   136: aload_1
    //   137: invokestatic 681	com/tencent/mm/sdk/platformtools/bi:Xf	(Ljava/lang/String;)Ljava/lang/String;
    //   140: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   149: new 19	com/tencent/mm/storage/emotion/EmojiInfo
    //   152: dup
    //   153: invokespecial 527	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   156: astore_2
    //   157: aload_2
    //   158: aload_1
    //   159: putfield 200	com/tencent/mm/storage/emotion/EmojiInfo:field_md5	Ljava/lang/String;
    //   162: aload_2
    //   163: sipush 153
    //   166: putfield 207	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   169: aload_0
    //   170: aload_2
    //   171: invokevirtual 274	com/tencent/mm/storage/emotion/d:o	(Lcom/tencent/mm/storage/emotion/EmojiInfo;)Z
    //   174: ifne -84 -> 90
    //   177: aconst_null
    //   178: areturn
    //   179: astore_3
    //   180: aconst_null
    //   181: astore_2
    //   182: aload_2
    //   183: astore_1
    //   184: ldc 77
    //   186: ldc_w 705
    //   189: iconst_1
    //   190: anewarray 81	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_3
    //   196: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   199: aastore
    //   200: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aload_2
    //   204: ifnull -102 -> 102
    //   207: aload_2
    //   208: invokeinterface 75 1 0
    //   213: goto -111 -> 102
    //   216: astore_2
    //   217: aconst_null
    //   218: astore_1
    //   219: aload_1
    //   220: ifnull +9 -> 229
    //   223: aload_1
    //   224: invokeinterface 75 1 0
    //   229: aload_2
    //   230: athrow
    //   231: ldc_w 707
    //   234: invokevirtual 695	java/lang/String:getBytes	()[B
    //   237: invokestatic 701	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   240: astore_1
    //   241: goto -117 -> 124
    //   244: astore_2
    //   245: goto -26 -> 219
    //   248: astore_3
    //   249: goto -67 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	d
    //   29	212	1	localObject1	Object
    //   23	185	2	localObject2	Object
    //   216	14	2	localObject3	Object
    //   244	1	2	localObject4	Object
    //   48	41	3	str	String
    //   179	17	3	localException1	Exception
    //   248	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	24	179	java/lang/Exception
    //   0	24	216	finally
    //   30	39	244	finally
    //   41	49	244	finally
    //   51	76	244	finally
    //   184	203	244	finally
    //   30	39	248	java/lang/Exception
    //   41	49	248	java/lang/Exception
    //   51	76	248	java/lang/Exception
  }
  
  public final String getTableName()
  {
    return "EmojiInfo";
  }
  
  /* Error */
  public final boolean gg(Context paramContext)
  {
    // Byte code:
    //   0: ldc 77
    //   2: ldc_w 712
    //   5: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: aload_0
    //   9: ldc_w 714
    //   12: invokevirtual 283	com/tencent/mm/storage/emotion/d:Zy	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   15: astore 7
    //   17: aload_0
    //   18: ldc_w 716
    //   21: invokevirtual 283	com/tencent/mm/storage/emotion/d:Zy	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   24: astore 8
    //   26: aload_0
    //   27: getstatic 719	com/tencent/mm/storage/emotion/EmojiInfo:tcE	I
    //   30: invokespecial 721	com/tencent/mm/storage/emotion/d:Dt	(I)I
    //   33: istore_2
    //   34: ldc 77
    //   36: ldc_w 723
    //   39: iconst_1
    //   40: anewarray 81	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: iload_2
    //   46: invokestatic 418	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   49: aastore
    //   50: invokestatic 343	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   53: aload 7
    //   55: ifnonnull +24 -> 79
    //   58: aload 8
    //   60: ifnull +14 -> 74
    //   63: aload 8
    //   65: invokevirtual 726	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   68: invokevirtual 259	java/lang/String:length	()I
    //   71: ifeq +8 -> 79
    //   74: iload_2
    //   75: iconst_2
    //   76: if_icmpgt +35 -> 111
    //   79: ldc 77
    //   81: ldc_w 728
    //   84: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload_0
    //   88: getstatic 369	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   91: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   94: pop
    //   95: aload_0
    //   96: getstatic 372	com/tencent/mm/storage/emotion/EmojiInfo:tcG	I
    //   99: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   102: pop
    //   103: aload_0
    //   104: getstatic 375	com/tencent/mm/storage/emotion/EmojiInfo:tcF	I
    //   107: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   110: pop
    //   111: aload_0
    //   112: ldc_w 732
    //   115: invokevirtual 283	com/tencent/mm/storage/emotion/d:Zy	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   118: astore 7
    //   120: aload 7
    //   122: ifnull +46 -> 168
    //   125: aload 7
    //   127: getfield 207	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   130: getstatic 369	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   133: if_icmpne +35 -> 168
    //   136: ldc 77
    //   138: ldc_w 734
    //   141: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload_0
    //   145: getstatic 369	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   148: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   151: pop
    //   152: aload_0
    //   153: getstatic 372	com/tencent/mm/storage/emotion/EmojiInfo:tcG	I
    //   156: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   159: pop
    //   160: aload_0
    //   161: getstatic 375	com/tencent/mm/storage/emotion/EmojiInfo:tcF	I
    //   164: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   167: pop
    //   168: aload_1
    //   169: ldc_w 736
    //   172: invokestatic 382	com/tencent/mm/storage/emotion/EmojiInfo:bt	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   175: astore 7
    //   177: aload 7
    //   179: ifnull +35 -> 214
    //   182: ldc 77
    //   184: ldc_w 738
    //   187: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: aload_0
    //   191: getstatic 369	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   194: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   197: pop
    //   198: aload_0
    //   199: getstatic 372	com/tencent/mm/storage/emotion/EmojiInfo:tcG	I
    //   202: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   205: pop
    //   206: aload_0
    //   207: getstatic 375	com/tencent/mm/storage/emotion/EmojiInfo:tcF	I
    //   210: invokespecial 730	com/tencent/mm/storage/emotion/d:Dv	(I)Z
    //   213: pop
    //   214: aload 7
    //   216: ifnull +8 -> 224
    //   219: aload 7
    //   221: invokevirtual 388	java/io/InputStream:close	()V
    //   224: aload_0
    //   225: getstatic 369	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   228: invokespecial 721	com/tencent/mm/storage/emotion/d:Dt	(I)I
    //   231: ifeq +5 -> 236
    //   234: iconst_1
    //   235: ireturn
    //   236: aconst_null
    //   237: astore 10
    //   239: aconst_null
    //   240: astore 9
    //   242: aload 9
    //   244: astore 8
    //   246: aload 10
    //   248: astore 7
    //   250: ldc 77
    //   252: ldc_w 740
    //   255: invokestatic 336	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   258: aload 9
    //   260: astore 8
    //   262: aload 10
    //   264: astore 7
    //   266: invokestatic 558	java/lang/System:currentTimeMillis	()J
    //   269: lstore_3
    //   270: aload 9
    //   272: astore 8
    //   274: aload 10
    //   276: astore 7
    //   278: aload_1
    //   279: invokevirtual 746	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   282: ldc_w 748
    //   285: invokevirtual 754	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   288: astore_1
    //   289: aload_1
    //   290: astore 8
    //   292: aload_1
    //   293: astore 7
    //   295: iconst_1
    //   296: anewarray 384	java/io/InputStream
    //   299: dup
    //   300: iconst_0
    //   301: aload_1
    //   302: aastore
    //   303: invokestatic 756	com/tencent/mm/storage/emotion/d:a	([Ljava/io/InputStream;)Ljava/util/List;
    //   306: astore 10
    //   308: aload_1
    //   309: astore 8
    //   311: aload_1
    //   312: astore 7
    //   314: ldc 77
    //   316: ldc_w 758
    //   319: iconst_1
    //   320: anewarray 81	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: invokestatic 558	java/lang/System:currentTimeMillis	()J
    //   328: lload_3
    //   329: lsub
    //   330: invokestatic 617	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   333: aastore
    //   334: invokestatic 343	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   337: aload_1
    //   338: astore 8
    //   340: aload_1
    //   341: astore 7
    //   343: invokestatic 558	java/lang/System:currentTimeMillis	()J
    //   346: lstore 5
    //   348: aload_1
    //   349: astore 8
    //   351: aload_1
    //   352: astore 7
    //   354: aload 10
    //   356: invokeinterface 536 1 0
    //   361: ifle +168 -> 529
    //   364: aload_1
    //   365: astore 8
    //   367: aload_1
    //   368: astore 7
    //   370: aload 10
    //   372: invokeinterface 536 1 0
    //   377: ifle +152 -> 529
    //   380: ldc2_w 620
    //   383: lstore_3
    //   384: aload_1
    //   385: astore 8
    //   387: aload_1
    //   388: astore 7
    //   390: aload_0
    //   391: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   394: instanceof 564
    //   397: ifeq +336 -> 733
    //   400: aload_1
    //   401: astore 8
    //   403: aload_1
    //   404: astore 7
    //   406: aload_0
    //   407: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   410: checkcast 564	com/tencent/mm/bt/h
    //   413: astore 9
    //   415: aload_1
    //   416: astore 8
    //   418: aload_1
    //   419: astore 7
    //   421: aload 9
    //   423: invokestatic 570	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   426: invokevirtual 573	java/lang/Thread:getId	()J
    //   429: invokevirtual 577	com/tencent/mm/bt/h:dO	(J)J
    //   432: lstore_3
    //   433: aload_1
    //   434: astore 8
    //   436: aload_1
    //   437: astore 7
    //   439: aload 10
    //   441: invokeinterface 581 1 0
    //   446: astore 10
    //   448: aload_1
    //   449: astore 8
    //   451: aload_1
    //   452: astore 7
    //   454: aload 10
    //   456: invokeinterface 586 1 0
    //   461: ifeq +122 -> 583
    //   464: aload_1
    //   465: astore 8
    //   467: aload_1
    //   468: astore 7
    //   470: aload 10
    //   472: invokeinterface 590 1 0
    //   477: checkcast 19	com/tencent/mm/storage/emotion/EmojiInfo
    //   480: invokevirtual 602	com/tencent/mm/storage/emotion/EmojiInfo:wH	()Landroid/content/ContentValues;
    //   483: astore 11
    //   485: aload_1
    //   486: astore 8
    //   488: aload_1
    //   489: astore 7
    //   491: aload_0
    //   492: getfield 45	com/tencent/mm/storage/emotion/d:diF	Lcom/tencent/mm/sdk/e/e;
    //   495: ldc 25
    //   497: ldc -60
    //   499: aload 11
    //   501: invokeinterface 606 4 0
    //   506: lconst_0
    //   507: lcmp
    //   508: ifge -60 -> 448
    //   511: aload 9
    //   513: ifnull +16 -> 529
    //   516: aload_1
    //   517: astore 8
    //   519: aload_1
    //   520: astore 7
    //   522: aload 9
    //   524: lload_3
    //   525: invokevirtual 610	com/tencent/mm/bt/h:gp	(J)I
    //   528: pop
    //   529: aload_1
    //   530: astore 8
    //   532: aload_1
    //   533: astore 7
    //   535: ldc 77
    //   537: ldc_w 760
    //   540: iconst_1
    //   541: anewarray 81	java/lang/Object
    //   544: dup
    //   545: iconst_0
    //   546: invokestatic 558	java/lang/System:currentTimeMillis	()J
    //   549: lload 5
    //   551: lsub
    //   552: invokestatic 617	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   555: aastore
    //   556: invokestatic 343	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   559: aload_1
    //   560: astore 8
    //   562: aload_1
    //   563: astore 7
    //   565: ldc 77
    //   567: ldc_w 762
    //   570: invokestatic 448	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   573: aload_1
    //   574: ifnull +7 -> 581
    //   577: aload_1
    //   578: invokevirtual 388	java/io/InputStream:close	()V
    //   581: iconst_1
    //   582: ireturn
    //   583: aload 9
    //   585: ifnull -56 -> 529
    //   588: aload_1
    //   589: astore 8
    //   591: aload_1
    //   592: astore 7
    //   594: aload 9
    //   596: lload_3
    //   597: invokevirtual 610	com/tencent/mm/bt/h:gp	(J)I
    //   600: pop
    //   601: goto -72 -> 529
    //   604: astore_1
    //   605: aload 8
    //   607: astore 7
    //   609: ldc 77
    //   611: new 95	java/lang/StringBuilder
    //   614: dup
    //   615: ldc_w 764
    //   618: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   621: aload_1
    //   622: invokevirtual 765	java/io/IOException:getMessage	()Ljava/lang/String;
    //   625: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   631: invokestatic 114	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   634: aload 8
    //   636: ifnull -55 -> 581
    //   639: aload 8
    //   641: invokevirtual 388	java/io/InputStream:close	()V
    //   644: goto -63 -> 581
    //   647: astore_1
    //   648: ldc 77
    //   650: ldc 79
    //   652: iconst_1
    //   653: anewarray 81	java/lang/Object
    //   656: dup
    //   657: iconst_0
    //   658: aload_1
    //   659: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   662: aastore
    //   663: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   666: goto -85 -> 581
    //   669: astore_1
    //   670: ldc 77
    //   672: ldc 79
    //   674: iconst_1
    //   675: anewarray 81	java/lang/Object
    //   678: dup
    //   679: iconst_0
    //   680: aload_1
    //   681: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   684: aastore
    //   685: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   688: goto -107 -> 581
    //   691: astore_1
    //   692: aload 7
    //   694: ifnull +8 -> 702
    //   697: aload 7
    //   699: invokevirtual 388	java/io/InputStream:close	()V
    //   702: aload_1
    //   703: athrow
    //   704: astore 7
    //   706: ldc 77
    //   708: ldc 79
    //   710: iconst_1
    //   711: anewarray 81	java/lang/Object
    //   714: dup
    //   715: iconst_0
    //   716: aload 7
    //   718: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   721: aastore
    //   722: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   725: goto -23 -> 702
    //   728: astore 7
    //   730: goto -506 -> 224
    //   733: aconst_null
    //   734: astore 9
    //   736: goto -303 -> 433
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	739	0	this	d
    //   0	739	1	paramContext	Context
    //   33	44	2	i	int
    //   269	328	3	l1	long
    //   346	204	5	l2	long
    //   15	683	7	localObject1	Object
    //   704	13	7	localException1	Exception
    //   728	1	7	localException2	Exception
    //   24	616	8	localObject2	Object
    //   240	495	9	localh	h
    //   237	234	10	localObject3	Object
    //   483	17	11	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   250	258	604	java/io/IOException
    //   266	270	604	java/io/IOException
    //   278	289	604	java/io/IOException
    //   295	308	604	java/io/IOException
    //   314	337	604	java/io/IOException
    //   343	348	604	java/io/IOException
    //   354	364	604	java/io/IOException
    //   370	380	604	java/io/IOException
    //   390	400	604	java/io/IOException
    //   406	415	604	java/io/IOException
    //   421	433	604	java/io/IOException
    //   439	448	604	java/io/IOException
    //   454	464	604	java/io/IOException
    //   470	485	604	java/io/IOException
    //   491	511	604	java/io/IOException
    //   522	529	604	java/io/IOException
    //   535	559	604	java/io/IOException
    //   565	573	604	java/io/IOException
    //   594	601	604	java/io/IOException
    //   639	644	647	java/lang/Exception
    //   577	581	669	java/lang/Exception
    //   250	258	691	finally
    //   266	270	691	finally
    //   278	289	691	finally
    //   295	308	691	finally
    //   314	337	691	finally
    //   343	348	691	finally
    //   354	364	691	finally
    //   370	380	691	finally
    //   390	400	691	finally
    //   406	415	691	finally
    //   421	433	691	finally
    //   439	448	691	finally
    //   454	464	691	finally
    //   470	485	691	finally
    //   491	511	691	finally
    //   522	529	691	finally
    //   535	559	691	finally
    //   565	573	691	finally
    //   594	601	691	finally
    //   609	634	691	finally
    //   697	702	704	java/lang/Exception
    //   219	224	728	java/lang/Exception
  }
  
  public final boolean j(List<EmojiInfo> paramList, String paramString)
  {
    if (paramList.size() <= 0)
    {
      x.i("MicroMsg.emoji.EmojiInfoStorage", "insert emoji list faild. list is null or size is 0.");
      return false;
    }
    x.i("MicroMsg.emoji.EmojiInfoStorage", "insertEmojiList groupId:%s size:%d", new Object[] { paramString, Integer.valueOf(paramList.size()) });
    h localh = null;
    if ((this.diF instanceof h)) {
      localh = (h)this.diF;
    }
    for (long l = localh.dO(Thread.currentThread().getId());; l = -1L)
    {
      Object localObject = zk(paramString);
      paramString = new HashMap();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject).next();
        paramString.put(localEmojiInfo.Xh(), localEmojiInfo);
      }
      int i = 0;
      while (i < paramList.size())
      {
        localObject = (EmojiInfo)paramList.get(i);
        ((EmojiInfo)localObject).field_temp = 0;
        this.diF.replace("EmojiInfo", "md5", ((EmojiInfo)localObject).wH());
        paramString.remove(((EmojiInfo)localObject).Xh());
        i += 1;
      }
      paramList = paramString.entrySet().iterator();
      while (paramList.hasNext())
      {
        localObject = (Map.Entry)paramList.next();
        paramString = (String)((Map.Entry)localObject).getKey();
        localObject = (EmojiInfo)((Map.Entry)localObject).getValue();
        ((EmojiInfo)localObject).field_temp = 1;
        this.diF.update("EmojiInfo", ((EmojiInfo)localObject).wH(), "md5=?", new String[] { paramString });
        x.d("MicroMsg.emoji.EmojiInfoStorage", "jacks modify excess emoji to %s", new Object[] { ((EmojiInfo)localObject).field_groupId });
      }
      if (localh != null) {
        localh.gp(l);
      }
      return true;
    }
  }
  
  public final int ln(boolean paramBoolean)
  {
    int j = 0;
    int k = 0;
    localObject3 = null;
    localObject1 = null;
    String str = "select count(*)  from EmojiInfo where catalog=? ";
    Object localObject4 = new String[1];
    localObject4[0] = EmojiGroupInfo.tcA;
    if (paramBoolean)
    {
      str = "select  count(*) from EmojiInfo where catalog IN (?,?)";
      localObject4 = new String[2];
      localObject4[0] = String.valueOf(EmojiGroupInfo.tcz);
      localObject4[1] = String.valueOf(EmojiGroupInfo.tcA);
    }
    try
    {
      localObject4 = this.diF.b(str, (String[])localObject4, 2);
      int i = k;
      if (localObject4 != null)
      {
        i = k;
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          localObject1 = localObject4;
          localObject3 = localObject4;
          i = ((Cursor)localObject4).getInt(0);
        }
      }
      j = i;
      if (localObject4 != null)
      {
        ((Cursor)localObject4).close();
        j = i;
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(localException) });
      localObject3 = localObject1;
      x.e("MicroMsg.emoji.EmojiInfoStorage", "[countCustomEmoji]Exception:%s", new Object[] { localException.toString() });
      return 0;
    }
    finally
    {
      if (localObject3 == null) {
        break label234;
      }
      ((Cursor)localObject3).close();
    }
    return j;
  }
  
  public final EmojiInfo n(EmojiInfo paramEmojiInfo)
  {
    if ((bi.oW(paramEmojiInfo.Xh())) || (paramEmojiInfo.Xh().length() <= 0))
    {
      x.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      return null;
    }
    if (o(paramEmojiInfo))
    {
      Xp("create_emoji_info_notify");
      return paramEmojiInfo;
    }
    return null;
  }
  
  public final boolean o(EmojiInfo paramEmojiInfo)
  {
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.cnB())) {
      x.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
    }
    long l;
    do
    {
      return false;
      ContentValues localContentValues = paramEmojiInfo.wH();
      l = this.diF.replace("EmojiInfo", "md5", localContentValues);
      if (l != -1L) {
        Xp(paramEmojiInfo.Xh());
      }
    } while (l < 0L);
    return true;
  }
  
  public final boolean p(EmojiInfo paramEmojiInfo)
  {
    boolean bool = true;
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.cnB()))
    {
      x.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      bool = false;
    }
    int i;
    do
    {
      return bool;
      i = this.diF.update("EmojiInfo", paramEmojiInfo.wH(), "md5=?", new String[] { paramEmojiInfo.Xh() });
      if (i > 0)
      {
        Xp(paramEmojiInfo.Xh());
        Xp("event_update_emoji");
      }
    } while (i > 0);
    return false;
  }
  
  public final boolean q(EmojiInfo paramEmojiInfo)
  {
    boolean bool = true;
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.cnB()))
    {
      x.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      bool = false;
    }
    while (this.diF.update("EmojiInfo", paramEmojiInfo.wH(), "md5=?", new String[] { paramEmojiInfo.Xh() }) > 0) {
      return bool;
    }
    return false;
  }
  
  public final List<EmojiInfo> zk(String paramString)
  {
    localArrayList = new ArrayList();
    localObject = null;
    str = null;
    try
    {
      paramString = this.diF.b("select * from EmojiInfo where groupId=? and temp=? order by idx asc", new String[] { paramString, "0" }, 2);
      if (paramString != null)
      {
        str = paramString;
        localObject = paramString;
        if (paramString.moveToFirst())
        {
          boolean bool;
          do
          {
            str = paramString;
            localObject = paramString;
            com.tencent.mm.plugin.emoji.d.aDh();
            str = paramString;
            localObject = paramString;
            EmojiInfo localEmojiInfo = new EmojiInfo(com.tencent.mm.plugin.emoji.d.aDi());
            str = paramString;
            localObject = paramString;
            localEmojiInfo.d(paramString);
            str = paramString;
            localObject = paramString;
            localArrayList.add(localEmojiInfo);
            str = paramString;
            localObject = paramString;
            bool = paramString.moveToNext();
          } while (bool);
        }
      }
      if (paramString != null) {
        paramString.close();
      }
    }
    catch (Exception paramString)
    {
      do
      {
        localObject = str;
        x.w("MicroMsg.emoji.EmojiInfoStorage", "[getEmojiListByGroupId] Exception:%s", new Object[] { paramString.toString() });
      } while (str == null);
      str.close();
      return localArrayList;
    }
    finally
    {
      if (localObject == null) {
        break label189;
      }
      ((Cursor)localObject).close();
    }
    return localArrayList;
  }
  
  public final int zs(String paramString)
  {
    long l = System.currentTimeMillis();
    Object localObject = null;
    String str = null;
    for (;;)
    {
      try
      {
        paramString = this.diF.b("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { paramString, "0" }, 2);
        if (paramString == null) {
          break label198;
        }
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst()) {
          break label198;
        }
        str = paramString;
        localObject = paramString;
        i = paramString.getInt(0);
        j = i;
        if (paramString != null)
        {
          paramString.close();
          j = i;
        }
      }
      catch (Exception paramString)
      {
        localObject = str;
        x.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bi.i(paramString) });
        localObject = str;
        x.e("MicroMsg.emoji.EmojiInfoStorage", "[countProductId]Count ProductId fail." + paramString.getMessage());
        if (str == null) {
          break label193;
        }
        str.close();
        j = 0;
        continue;
      }
      finally
      {
        if (localObject == null) {
          continue;
        }
        ((Cursor)localObject).close();
      }
      x.d("MicroMsg.emoji.EmojiInfoStorage", "count product id use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return j;
      label193:
      int j = 0;
      continue;
      label198:
      int i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */