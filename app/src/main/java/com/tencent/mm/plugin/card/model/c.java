package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class c
  extends i<CardInfo>
{
  public static final String[] diD = { i.a(CardInfo.dhO, "UserCardInfo"), "CREATE INDEX IF NOT EXISTS  stickyIndexIndex ON UserCardInfo ( stickyIndex ) " };
  public e diF;
  
  public c(e parame)
  {
    super(parame, CardInfo.dhO, "UserCardInfo", null);
    this.diF = parame;
  }
  
  /* Error */
  public final java.util.List<CardInfo> awW()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/mm/plugin/card/model/c:diF	Lcom/tencent/mm/sdk/e/e;
    //   4: ldc 43
    //   6: iconst_1
    //   7: anewarray 13	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: ldc 45
    //   14: aastore
    //   15: invokeinterface 51 3 0
    //   20: astore_1
    //   21: aload_1
    //   22: ifnonnull +12 -> 34
    //   25: ldc 53
    //   27: ldc 55
    //   29: invokestatic 61	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aconst_null
    //   33: areturn
    //   34: new 63	java/util/ArrayList
    //   37: dup
    //   38: invokespecial 65	java/util/ArrayList:<init>	()V
    //   41: astore_2
    //   42: aload_1
    //   43: invokeinterface 71 1 0
    //   48: ifeq +54 -> 102
    //   51: new 15	com/tencent/mm/plugin/card/model/CardInfo
    //   54: dup
    //   55: invokespecial 72	com/tencent/mm/plugin/card/model/CardInfo:<init>	()V
    //   58: astore_3
    //   59: aload_3
    //   60: aload_1
    //   61: invokevirtual 76	com/tencent/mm/plugin/card/model/CardInfo:d	(Landroid/database/Cursor;)V
    //   64: aload_2
    //   65: aload_3
    //   66: invokeinterface 82 2 0
    //   71: pop
    //   72: goto -30 -> 42
    //   75: astore_3
    //   76: ldc 53
    //   78: ldc 84
    //   80: iconst_1
    //   81: anewarray 86	java/lang/Object
    //   84: dup
    //   85: iconst_0
    //   86: aload_3
    //   87: invokevirtual 90	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   90: aastore
    //   91: invokestatic 93	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload_1
    //   95: invokeinterface 96 1 0
    //   100: aload_2
    //   101: areturn
    //   102: aload_1
    //   103: invokeinterface 96 1 0
    //   108: aload_2
    //   109: areturn
    //   110: astore_2
    //   111: aload_1
    //   112: invokeinterface 96 1 0
    //   117: aload_2
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	c
    //   20	92	1	localCursor	Cursor
    //   41	68	2	localArrayList	java.util.ArrayList
    //   110	8	2	localObject	Object
    //   58	8	3	localCardInfo	CardInfo
    //   75	12	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   42	72	75	java/lang/Exception
    //   42	72	110	finally
    //   76	94	110	finally
  }
  
  public final Cursor nH(int paramInt)
  {
    long l = bi.VE();
    Object localObject = "update UserCardInfo set stickyIndex=0, stickyEndTime=0 where stickyIndex>0 and (" + l + ">stickyEndTime and stickyEndTime<>0)";
    this.diF.fV("UserCardInfo", (String)localObject);
    localObject = new StringBuilder("select * from UserCardInfo");
    switch (c.1.hwe[(paramInt - 1)])
    {
    }
    for (;;)
    {
      ((StringBuilder)localObject).append(" order by stickyIndex desc, status asc , updateTime desc");
      if (paramInt == n.a.hwS) {
        ((StringBuilder)localObject).append(" LIMIT 3");
      }
      return this.diF.rawQuery(((StringBuilder)localObject).toString(), null);
      ((StringBuilder)localObject).append(" where (status=0 OR status=5)");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) AND card_type=10");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) AND card_type!=10");
      continue;
      ((StringBuilder)localObject).append(" where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
    }
  }
  
  public final CardInfo xm(String paramString)
  {
    CardInfo localCardInfo = new CardInfo();
    localCardInfo.field_card_id = paramString;
    if (super.b(localCardInfo, new String[0])) {
      return localCardInfo;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */