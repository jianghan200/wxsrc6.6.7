package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;

public class mn
{
  private String a = "";
  private Context b;
  
  public mn(Context paramContext)
  {
    this.b = paramContext;
    this.a = kh.c();
  }
  
  /* Error */
  public Integer a()
  {
    // Byte code:
    //   0: invokestatic 38	com/tencent/tencentmap/mapsdk/a/pn:a	()Lcom/tencent/tencentmap/mapsdk/a/pn;
    //   3: aload_0
    //   4: getfield 17	com/tencent/tencentmap/mapsdk/a/mn:a	Ljava/lang/String;
    //   7: invokevirtual 41	com/tencent/tencentmap/mapsdk/a/pn:a	(Ljava/lang/String;)Lcom/tencent/tencentmap/mapsdk/a/po;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull +10 -> 22
    //   15: aload_3
    //   16: getfield 46	com/tencent/tencentmap/mapsdk/a/po:a	[B
    //   19: ifnonnull +5 -> 24
    //   22: aconst_null
    //   23: areturn
    //   24: aload_3
    //   25: getfield 48	com/tencent/tencentmap/mapsdk/a/po:b	Ljava/lang/String;
    //   28: astore_2
    //   29: aload_3
    //   30: getfield 46	com/tencent/tencentmap/mapsdk/a/po:a	[B
    //   33: astore_3
    //   34: new 50	java/lang/String
    //   37: dup
    //   38: aload_3
    //   39: aload_2
    //   40: invokespecial 53	java/lang/String:<init>	([BLjava/lang/String;)V
    //   43: astore_2
    //   44: new 55	org/json/JSONObject
    //   47: dup
    //   48: aload_2
    //   49: invokespecial 58	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   52: astore_2
    //   53: aload_2
    //   54: ldc 60
    //   56: invokevirtual 64	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   59: pop
    //   60: aload_2
    //   61: ldc 66
    //   63: invokevirtual 64	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   66: astore_2
    //   67: aload_2
    //   68: ldc 68
    //   70: invokevirtual 72	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   73: istore_1
    //   74: iload_1
    //   75: invokestatic 78	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: areturn
    //   79: astore_2
    //   80: aconst_null
    //   81: areturn
    //   82: astore_2
    //   83: aconst_null
    //   84: areturn
    //   85: astore_3
    //   86: goto -26 -> 60
    //   89: astore_2
    //   90: aconst_null
    //   91: areturn
    //   92: astore_2
    //   93: aconst_null
    //   94: areturn
    //   95: astore_2
    //   96: aconst_null
    //   97: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	mn
    //   73	2	1	i	int
    //   28	40	2	localObject1	Object
    //   79	1	2	localJSONException1	org.json.JSONException
    //   82	1	2	localJSONException2	org.json.JSONException
    //   89	1	2	localException1	Exception
    //   92	1	2	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   95	1	2	localException2	Exception
    //   10	29	3	localObject2	Object
    //   85	1	3	localJSONException3	org.json.JSONException
    // Exception table:
    //   from	to	target	type
    //   67	74	79	org/json/JSONException
    //   60	67	82	org/json/JSONException
    //   53	60	85	org/json/JSONException
    //   44	53	89	java/lang/Exception
    //   34	44	92	java/io/UnsupportedEncodingException
    //   0	11	95	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */