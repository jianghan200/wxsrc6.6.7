package com.tencent.mm.storage.emotion;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ao;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class a
  extends i<EmojiGroupInfo>
  implements g.a
{
  public static final String[] diD = { i.a(EmojiGroupInfo.dhO, "EmojiGroupInfo") };
  public com.tencent.mm.sdk.e.e diF;
  
  public a(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, EmojiGroupInfo.dhO, "EmojiGroupInfo", null);
    this.diF = parame;
  }
  
  private static final String Dp(int paramInt)
  {
    return " ( type = '" + paramInt + "' ) ";
  }
  
  private static final String Dq(int paramInt)
  {
    return " ( " + Dp(paramInt) + " and ( ( ( flag & 256 ) = 0 )  or ( flag is null ) )  ) ";
  }
  
  private int cnd()
  {
    int j = 0;
    int k = 0;
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.diF.b("select  count(*) from EmojiInfo where catalog=?", new String[] { EmojiGroupInfo.tcA }, 2);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Check GroupId Exist Faild." + localException.getMessage());
      return 0;
    }
    finally
    {
      if (localObject3 == null) {
        break label168;
      }
      ((Cursor)localObject3).close();
    }
    return j;
  }
  
  public static boolean cnl()
  {
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(208912, Boolean.valueOf(false))).booleanValue();
  }
  
  private static String cno()
  {
    return Dp(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Dp(EmojiGroupInfo.TYPE_CUSTOM) + " or " + Dp(EmojiGroupInfo.tcv) + " or " + Dp(EmojiGroupInfo.tcx);
  }
  
  private static final String cnp()
  {
    return " ( " + Dp(EmojiGroupInfo.tcv) + " and  ( status = '7' ) " + " ) ";
  }
  
  private ArrayList<EmojiGroupInfo> gh(Context paramContext)
  {
    EmojiGroupInfo localEmojiGroupInfo = null;
    Element localElement = null;
    NodeList localNodeList = null;
    localArrayList = new ArrayList();
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    localObject2 = localNodeList;
    localObject3 = localEmojiGroupInfo;
    localObject1 = localElement;
    try
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init,parse xml start.");
      localObject2 = localNodeList;
      localObject3 = localEmojiGroupInfo;
      localObject1 = localElement;
      paramContext = paramContext.getAssets().open("custom_emoji/manifest.xml");
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      localNodeList = localDocumentBuilderFactory.newDocumentBuilder().parse(paramContext).getDocumentElement().getElementsByTagName("catalog");
      i = 0;
    }
    catch (IOException paramContext)
    {
      int k;
      localObject1 = localObject2;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bi.i(paramContext) });
      localObject1 = localObject2;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "init emoji group db error." + paramContext.getMessage());
      if (localObject2 == null) {
        break label661;
      }
      do
      {
        try
        {
          ((InputStream)localObject2).close();
          return localArrayList;
        }
        catch (Exception paramContext)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
          return localArrayList;
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (localArrayList.size() > 0)
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          ds(localArrayList);
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init,parse xml end.");
      } while (paramContext == null);
      try
      {
        paramContext.close();
        return localArrayList;
      }
      catch (Exception paramContext)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
        return localArrayList;
      }
    }
    catch (Exception paramContext)
    {
      do
      {
        localObject1 = localObject3;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bi.i(paramContext) });
        localObject1 = localObject3;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "parse xml error; " + paramContext.getMessage());
      } while (localObject3 == null);
      try
      {
        ((InputStream)localObject3).close();
        return localArrayList;
      }
      catch (Exception paramContext)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
        return localArrayList;
      }
    }
    finally
    {
      for (;;)
      {
        int i;
        if (localObject1 != null) {}
        try
        {
          ((InputStream)localObject1).close();
          throw paramContext;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", localException, "", new Object[0]);
          }
        }
        i += 1;
        continue;
        int j = 0;
      }
    }
    localObject2 = paramContext;
    localObject3 = paramContext;
    localObject1 = paramContext;
    if (i < localNodeList.getLength())
    {
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      localEmojiGroupInfo = new EmojiGroupInfo();
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      localElement = (Element)localNodeList.item(i);
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      k = Integer.decode(localElement.getAttribute("id")).intValue();
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      if (!TextUtils.isEmpty(localElement.getAttribute("sort")))
      {
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "Set Sort id:%d,sort:%d", new Object[] { Integer.valueOf(k), Integer.decode(localElement.getAttribute("sort")) });
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        j = EmojiGroupInfo.tcz;
        if ((k & j) != j) {
          break label881;
        }
        j = 1;
        if (j == 0) {
          break label578;
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (cnd() <= 0)
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          if (!cnl()) {
            break label578;
          }
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_sort = -1;
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        com.tencent.mm.kernel.g.Ei().DT().set(208912, Boolean.valueOf(true));
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "moveCustomEmojiTabToSecond");
      }
      for (;;)
      {
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_productID = String.valueOf(k);
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_packName = localElement.getAttribute("name");
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (!TextUtils.isEmpty(localElement.getAttribute("type")))
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          localEmojiGroupInfo.field_type = Integer.decode(localElement.getAttribute("type")).intValue();
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (!TextUtils.isEmpty(localElement.getAttribute("free")))
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          localEmojiGroupInfo.field_packType = Integer.decode(localElement.getAttribute("free")).intValue();
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_SYSTEM)
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_CUSTOM) {
            break;
          }
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localArrayList.add(localEmojiGroupInfo);
        break;
        label578:
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_sort = (i + 1);
      }
    }
  }
  
  public final boolean Zt(String paramString)
  {
    localObject = null;
    Cursor localCursor = null;
    boolean bool2 = false;
    boolean bool1 = false;
    if (TextUtils.isEmpty(paramString)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "product id is null.");
    }
    String str = "select count(*) from EmojiGroupInfo where productID = '" + paramString + "' AND  ( status = '7' ) " + " AND ( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) ";
    paramString = localCursor;
    do
    {
      try
      {
        localCursor = this.diF.b(str, null, 2);
        if (localCursor == null) {
          continue;
        }
        paramString = localCursor;
        localObject = localCursor;
        if (!localCursor.moveToFirst()) {
          continue;
        }
        paramString = localCursor;
        localObject = localCursor;
        int i = localCursor.getInt(0);
        if (i > 0) {
          bool1 = true;
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
        do
        {
          localObject = paramString;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Check GroupId Exist Faild." + localException.getMessage());
        } while (paramString == null);
        paramString.close();
        return false;
      }
      finally
      {
        if (localObject == null) {
          break;
        }
        ((Cursor)localObject).close();
      }
      return bool2;
    } while (localCursor == null);
    localCursor.close();
    return false;
  }
  
  public final boolean Zu(String paramString)
  {
    String str;
    if (!bi.oW(paramString)) {
      str = paramString;
    }
    for (;;)
    {
      try
      {
        if (paramString.equals("com.tencent.xin.emoticon.tusiji")) {
          str = EmojiGroupInfo.tcy;
        }
        paramString = br(str, true);
        if (paramString == null)
        {
          bool = false;
          if (bool)
          {
            b("event_update_group", 0, bi.cjd().toString());
            Xp("delete_group");
          }
          return bool;
        }
        if (paramString != null)
        {
          if (paramString.field_type == EmojiGroupInfo.TYPE_CUSTOM) {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks refuse delete custom emoji");
          }
        }
        else
        {
          paramString.field_lastUseTime = System.currentTimeMillis();
          paramString.field_recommand = 0;
          paramString.field_sync = 0;
          bool = a(paramString);
          continue;
        }
        paramString.field_flag |= 0x100;
        paramString.field_status = -1;
        paramString.field_sort = 1;
        paramString.field_recommand = 0;
        paramString.field_sync = 0;
        continue;
        boolean bool = false;
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Delete By ProductId fail." + paramString.getMessage());
      }
    }
  }
  
  public final int a(com.tencent.mm.bt.g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final void ac(ArrayList<String> paramArrayList)
  {
    h localh = null;
    long l;
    if ((this.diF instanceof h))
    {
      localh = (h)this.diF;
      l = localh.dO(Thread.currentThread().getId());
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround deleteByGroupIdList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
          Zu((String)paramArrayList.next());
        }
      }
      if (localh != null)
      {
        localh.gp(l);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end deleteByGroupIdList transaction");
      }
      return;
      l = -1L;
    }
  }
  
  /* Error */
  public final EmojiGroupInfo br(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/mm/storage/emotion/a:diF	Lcom/tencent/mm/sdk/e/e;
    //   4: ldc_w 465
    //   7: iconst_1
    //   8: anewarray 15	java/lang/String
    //   11: dup
    //   12: iconst_0
    //   13: aload_1
    //   14: aastore
    //   15: iconst_2
    //   16: invokeinterface 84 4 0
    //   21: astore_3
    //   22: aload_3
    //   23: ifnull +57 -> 80
    //   26: aload_3
    //   27: astore 4
    //   29: aload_3
    //   30: invokeinterface 90 1 0
    //   35: ifeq +45 -> 80
    //   38: aload_3
    //   39: astore 4
    //   41: new 17	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   44: dup
    //   45: invokespecial 221	com/tencent/mm/storage/emotion/EmojiGroupInfo:<init>	()V
    //   48: astore 5
    //   50: aload_3
    //   51: astore 4
    //   53: aload 5
    //   55: aload_3
    //   56: invokevirtual 468	com/tencent/mm/storage/emotion/EmojiGroupInfo:d	(Landroid/database/Cursor;)V
    //   59: aload 5
    //   61: astore 4
    //   63: aload_3
    //   64: ifnull +13 -> 77
    //   67: aload_3
    //   68: invokeinterface 97 1 0
    //   73: aload 5
    //   75: astore 4
    //   77: aload 4
    //   79: areturn
    //   80: aload_3
    //   81: ifnull +156 -> 237
    //   84: aload_3
    //   85: invokeinterface 97 1 0
    //   90: aconst_null
    //   91: astore_1
    //   92: aload_1
    //   93: astore 4
    //   95: aload_1
    //   96: ifnonnull -19 -> 77
    //   99: iload_2
    //   100: ifeq +87 -> 187
    //   103: aconst_null
    //   104: areturn
    //   105: astore 5
    //   107: aconst_null
    //   108: astore 6
    //   110: aconst_null
    //   111: astore_3
    //   112: aload 6
    //   114: astore 4
    //   116: ldc 99
    //   118: new 41	java/lang/StringBuilder
    //   121: dup
    //   122: ldc_w 470
    //   125: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload_1
    //   129: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: ldc_w 472
    //   135: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload 5
    //   140: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   143: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 110	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload 6
    //   154: ifnull +78 -> 232
    //   157: aload 6
    //   159: invokeinterface 97 1 0
    //   164: aload_3
    //   165: astore_1
    //   166: goto -74 -> 92
    //   169: astore_1
    //   170: aconst_null
    //   171: astore 4
    //   173: aload 4
    //   175: ifnull +10 -> 185
    //   178: aload 4
    //   180: invokeinterface 97 1 0
    //   185: aload_1
    //   186: athrow
    //   187: new 17	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   190: dup
    //   191: invokespecial 221	com/tencent/mm/storage/emotion/EmojiGroupInfo:<init>	()V
    //   194: areturn
    //   195: astore_1
    //   196: goto -23 -> 173
    //   199: astore 5
    //   201: aconst_null
    //   202: astore 4
    //   204: aload_3
    //   205: astore 6
    //   207: aload 4
    //   209: astore_3
    //   210: goto -98 -> 112
    //   213: astore 6
    //   215: aload 5
    //   217: astore 4
    //   219: aload 6
    //   221: astore 5
    //   223: aload_3
    //   224: astore 6
    //   226: aload 4
    //   228: astore_3
    //   229: goto -117 -> 112
    //   232: aload_3
    //   233: astore_1
    //   234: goto -142 -> 92
    //   237: aconst_null
    //   238: astore_1
    //   239: goto -147 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	this	a
    //   0	242	1	paramString	String
    //   0	242	2	paramBoolean	boolean
    //   21	212	3	localObject1	Object
    //   27	200	4	localObject2	Object
    //   48	26	5	localEmojiGroupInfo	EmojiGroupInfo
    //   105	34	5	localException1	Exception
    //   199	17	5	localException2	Exception
    //   221	1	5	localObject3	Object
    //   108	98	6	localObject4	Object
    //   213	7	6	localException3	Exception
    //   224	1	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   0	22	105	java/lang/Exception
    //   0	22	169	finally
    //   29	38	195	finally
    //   41	50	195	finally
    //   53	59	195	finally
    //   116	152	195	finally
    //   29	38	199	java/lang/Exception
    //   41	50	199	java/lang/Exception
    //   53	59	213	java/lang/Exception
  }
  
  public final boolean c(EmojiGroupInfo paramEmojiGroupInfo)
  {
    if (paramEmojiGroupInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.emoji.EmojiGroupInfoStorage", "insert assertion!,invalid emojigroup info.");
      return false;
    }
    paramEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
    paramEmojiGroupInfo.field_sort = 1;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks insert: packname: %s, lasttime: %d", new Object[] { paramEmojiGroupInfo.field_packName, Long.valueOf(paramEmojiGroupInfo.field_lastUseTime) });
    paramEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
    if (paramEmojiGroupInfo != null) {
      paramEmojiGroupInfo.field_flag &= 0xFEFF;
    }
    boolean bool = a(paramEmojiGroupInfo);
    if (bool) {
      b("event_update_group", 0, bi.cjd().toString());
    }
    return bool;
  }
  
  public final boolean cne()
  {
    boolean bool = true;
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.diF.b("select * from EmojiGroupInfo where type=?", new String[] { EmojiGroupInfo.TYPE_SYSTEM }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
          localObject1 = localCursor;
          localObject3 = localCursor;
          localEmojiGroupInfo.d(localCursor);
          localObject1 = localCursor;
          localObject3 = localCursor;
          int i = localEmojiGroupInfo.field_flag;
          if ((i & 0x100) > 0)
          {
            i = 1;
            if (i != 0) {
              break label143;
            }
          }
          for (;;)
          {
            if (localCursor != null) {
              localCursor.close();
            }
            return bool;
            i = 0;
            break;
            label143:
            bool = false;
          }
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", localException.toString());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label203;
      }
      ((Cursor)localObject3).close();
    }
    return false;
  }
  
  public final List<EmojiGroupInfo> cnf()
  {
    localObject3 = null;
    localObject1 = null;
    localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + Dq(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Dq(EmojiGroupInfo.TYPE_CUSTOM) + " order by sort ASC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
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
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.d((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get system group fail." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label224;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final List<EmojiGroupInfo> cng()
  {
    localObject3 = null;
    localObject1 = null;
    localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + cno() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
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
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.d((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get all group fail." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label207;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final HashMap<String, EmojiGroupInfo> cnh()
  {
    localObject3 = null;
    localObject1 = null;
    localHashMap = new HashMap();
    Object localObject4 = "select * from EmojiGroupInfo where " + cno() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
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
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.d((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localHashMap.put(localEmojiGroupInfo.field_productID, localEmojiGroupInfo);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get all group fail." + localException.getMessage());
      return localHashMap;
    }
    finally
    {
      if (localObject3 == null) {
        break label210;
      }
      ((Cursor)localObject3).close();
    }
    return localHashMap;
  }
  
  public final ArrayList<EmojiGroupInfo> cni()
  {
    localObject3 = null;
    localObject1 = null;
    localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + cnp() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
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
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.d((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get all group fail." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label205;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final int cnj()
  {
    localObject3 = null;
    localObject1 = null;
    int j = 0;
    int k = 0;
    Object localObject4 = "select count(*) from EmojiGroupInfo where " + cnp() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getDownloadGroupListCount fail." + localException.getMessage());
      return 0;
    }
    finally
    {
      if (localObject3 == null) {
        break label174;
      }
      ((Cursor)localObject3).close();
    }
    return j;
  }
  
  public final HashMap<String, ao> cnk()
  {
    localObject3 = null;
    localObject1 = null;
    localHashMap = new HashMap();
    Object localObject4 = "select * from EmojiGroupInfo where " + cnp() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          localObject1 = localObject4;
          localObject3 = localObject4;
          ao localao = new ao();
          localObject1 = localObject4;
          localObject3 = localObject4;
          int i = ((Cursor)localObject4).getColumnIndex("productID");
          localObject1 = localObject4;
          localObject3 = localObject4;
          int j = ((Cursor)localObject4).getColumnIndex("packName");
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            String str = ((Cursor)localObject4).getString(i);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localao.bKk = str;
            localObject1 = localObject4;
            localObject3 = localObject4;
            localao.ioy = ((Cursor)localObject4).getString(j);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localao.Dl(7);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localHashMap.put(str, localao);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get download group map failed." + localException.getMessage());
      return localHashMap;
    }
    finally
    {
      if (localObject3 == null) {
        break label318;
      }
      ((Cursor)localObject3).close();
    }
    return localHashMap;
  }
  
  public final void cnm()
  {
    String str = EmojiGroupInfo.TYPE_CUSTOM;
    str = "UPDATE EmojiGroupInfo SET sort=-1,lastUseTime=" + System.currentTimeMillis() + " WHERE type=" + str;
    if (this.diF.fV("EmojiGroupInfo", str)) {
      b("event_update_group", 0, bi.cjd().toString());
    }
    com.tencent.mm.kernel.g.Ei().DT().set(208912, Boolean.valueOf(true));
  }
  
  public final ArrayList<EmojiGroupInfo> cnn()
  {
    localObject3 = null;
    localObject1 = null;
    localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + cnp() + " or " + Dq(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Dq(EmojiGroupInfo.TYPE_CUSTOM) + " or  ( recommand = '1' ) " + " order by sort ASC,idx ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.diF.b((String)localObject4, null, 2);
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
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.d((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get Panel EmojiGroupInfo." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label239;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  /* Error */
  public final boolean cnq()
  {
    // Byte code:
    //   0: new 41	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   7: getstatic 143	com/tencent/mm/storage/emotion/EmojiGroupInfo:TYPE_SYSTEM	I
    //   10: invokevirtual 50	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   13: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   16: astore_3
    //   17: new 41	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   24: getstatic 151	com/tencent/mm/storage/emotion/EmojiGroupInfo:tcv	I
    //   27: invokevirtual 50	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   30: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: astore 4
    //   35: ldc 99
    //   37: ldc_w 577
    //   40: iconst_1
    //   41: anewarray 252	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: ldc_w 579
    //   49: aastore
    //   50: invokestatic 435	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   53: aconst_null
    //   54: astore_2
    //   55: aload_0
    //   56: getfield 37	com/tencent/mm/storage/emotion/a:diF	Lcom/tencent/mm/sdk/e/e;
    //   59: ldc_w 579
    //   62: iconst_4
    //   63: anewarray 15	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_3
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload 4
    //   74: aastore
    //   75: dup
    //   76: iconst_2
    //   77: ldc_w 581
    //   80: aastore
    //   81: dup
    //   82: iconst_3
    //   83: ldc_w 583
    //   86: aastore
    //   87: iconst_2
    //   88: invokeinterface 84 4 0
    //   93: astore_3
    //   94: aload_3
    //   95: ifnull +28 -> 123
    //   98: aload_3
    //   99: astore_2
    //   100: aload_3
    //   101: invokeinterface 90 1 0
    //   106: istore_1
    //   107: iload_1
    //   108: ifeq +15 -> 123
    //   111: aload_3
    //   112: ifnull +9 -> 121
    //   115: aload_3
    //   116: invokeinterface 97 1 0
    //   121: iconst_1
    //   122: ireturn
    //   123: aload_3
    //   124: ifnull +9 -> 133
    //   127: aload_3
    //   128: invokeinterface 97 1 0
    //   133: iconst_0
    //   134: ireturn
    //   135: astore_2
    //   136: aconst_null
    //   137: astore_2
    //   138: ldc 99
    //   140: ldc_w 585
    //   143: invokestatic 110	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: aload_2
    //   147: ifnull -14 -> 133
    //   150: aload_2
    //   151: invokeinterface 97 1 0
    //   156: goto -23 -> 133
    //   159: astore_3
    //   160: aload_2
    //   161: ifnull +9 -> 170
    //   164: aload_2
    //   165: invokeinterface 97 1 0
    //   170: aload_3
    //   171: athrow
    //   172: astore_3
    //   173: goto -13 -> 160
    //   176: astore_2
    //   177: aload_3
    //   178: astore_2
    //   179: goto -41 -> 138
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	a
    //   106	2	1	bool	boolean
    //   54	46	2	localObject1	Object
    //   135	1	2	localException1	Exception
    //   137	28	2	localObject2	Object
    //   176	1	2	localException2	Exception
    //   178	1	2	localObject3	Object
    //   16	112	3	localObject4	Object
    //   159	12	3	localObject5	Object
    //   172	6	3	localObject6	Object
    //   33	40	4	str	String
    // Exception table:
    //   from	to	target	type
    //   55	94	135	java/lang/Exception
    //   55	94	159	finally
    //   100	107	159	finally
    //   138	146	172	finally
    //   100	107	176	java/lang/Exception
  }
  
  public final List<String> cnr()
  {
    localArrayList = new ArrayList();
    Object localObject5 = EmojiGroupInfo.tcv;
    Object localObject3 = null;
    localObject1 = null;
    try
    {
      localObject5 = this.diF.b("select productID from EmojiGroupInfo where type=? and sync=?", new String[] { localObject5, "1" }, 2);
      if (localObject5 != null)
      {
        localObject1 = localObject5;
        localObject3 = localObject5;
        if (((Cursor)localObject5).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject5;
            localObject3 = localObject5;
            localArrayList.add(((Cursor)localObject5).getString(0));
            localObject1 = localObject5;
            localObject3 = localObject5;
            bool = ((Cursor)localObject5).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      localObject4 = localObject1;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getNeedToSyncStoreEmojiProductList. exception.%s", new Object[] { bi.cjd() });
      return localArrayList;
    }
    finally
    {
      Object localObject4;
      if (localObject4 == null) {
        break label180;
      }
      ((Cursor)localObject4).close();
    }
    return localArrayList;
  }
  
  public final List<String> cns()
  {
    localArrayList = new ArrayList();
    Object localObject5 = EmojiGroupInfo.tcv;
    String str = EmojiGroupInfo.TYPE_SYSTEM;
    Object localObject3 = null;
    localObject1 = null;
    try
    {
      localObject5 = this.diF.b("select productID from EmojiGroupInfo where sync=? and (type=?  and status=?) or (type=? and flag=?)", new String[] { "0", localObject5, "7", str, "0" }, 2);
      if (localObject5 != null)
      {
        localObject1 = localObject5;
        localObject3 = localObject5;
        if (((Cursor)localObject5).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject5;
            localObject3 = localObject5;
            localArrayList.add(((Cursor)localObject5).getString(0));
            localObject1 = localObject5;
            localObject3 = localObject5;
            bool = ((Cursor)localObject5).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      localObject4 = localObject1;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getNeedToUploadStoreEmojiProductList. exception.%s", new Object[] { bi.cjd() });
      return localArrayList;
    }
    finally
    {
      Object localObject4;
      if (localObject4 == null) {
        break label215;
      }
      ((Cursor)localObject4).close();
    }
    return localArrayList;
  }
  
  public final ArrayList<EmojiGroupInfo> cnt()
  {
    localArrayList = new ArrayList();
    Object localObject4 = EmojiGroupInfo.tcv;
    Object localObject5 = EmojiGroupInfo.TYPE_SYSTEM;
    localObject3 = null;
    localObject1 = null;
    try
    {
      localObject4 = this.diF.b("select * from EmojiGroupInfo where  (type=?  and status=?) or (type=? and flag=?)  order by sort ASC,idx ASC,lastUseTime DESC", new String[] { localObject4, "7", localObject5, "0" }, 2);
      localObject1 = localObject4;
      localObject3 = localObject4;
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.emoji.EmojiGroupInfoStorage", "getNewMineGroupList : ===========");
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
            localObject5 = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            ((EmojiGroupInfo)localObject5).d((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localObject5);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get Panel EmojiGroupInfo." + localException.getMessage());
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label254;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  public final void cnu()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart begin");
    EmojiGroupInfo localEmojiGroupInfo = br(String.valueOf(EmojiGroupInfo.tcz), false);
    if (localEmojiGroupInfo == null) {
      localEmojiGroupInfo = new EmojiGroupInfo();
    }
    for (;;)
    {
      localEmojiGroupInfo.field_productID = String.valueOf(EmojiGroupInfo.tcz);
      localEmojiGroupInfo.field_packName = "emoji_custom_group";
      localEmojiGroupInfo.field_type = EmojiGroupInfo.TYPE_CUSTOM;
      localEmojiGroupInfo.field_status = 0;
      localEmojiGroupInfo.field_packStatus = 1;
      localEmojiGroupInfo.field_flag = 0;
      a(localEmojiGroupInfo);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart end");
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "EmojiGroupInfo:%s", new Object[] { localEmojiGroupInfo.toString() });
    }
  }
  
  public final boolean ds(List<EmojiGroupInfo> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "updateList . list is null.");
      return false;
    }
    h localh = null;
    long l;
    if ((this.diF instanceof h))
    {
      localh = (h)this.diF;
      l = localh.dO(Thread.currentThread().getId());
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround updateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int i = 0;
      while (i < paramList.size())
      {
        EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)paramList.get(i);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks packname: productid: %s, lasttime: %d, sort: %d", new Object[] { localEmojiGroupInfo.field_productID, Long.valueOf(localEmojiGroupInfo.field_lastUseTime), Integer.valueOf(localEmojiGroupInfo.field_sort) });
        a(localEmojiGroupInfo);
        i += 1;
      }
      if (localh != null)
      {
        localh.gp(l);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
      }
      b("event_update_group", 0, bi.cjd().toString());
      return true;
      l = -1L;
    }
  }
  
  public final String getTableName()
  {
    return "EmojiGroupInfo";
  }
  
  public final boolean gg(Context paramContext)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init start.");
    gh(paramContext);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init end.");
    return true;
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
          break label202;
        }
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst()) {
          break label202;
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
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bi.i(paramString) });
        localObject = str;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiGroupInfoStorage", "[countProductId]Count ProductId fail." + paramString.getMessage());
        if (str == null) {
          break label197;
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
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiGroupInfoStorage", "count product id use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return j;
      label197:
      int j = 0;
      continue;
      label202:
      int i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/emotion/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */