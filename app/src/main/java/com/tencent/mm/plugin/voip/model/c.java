package com.tencent.mm.plugin.voip.model;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.os.Environment;
import android.view.Surface;
import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class c
  extends Thread
{
  public static int oHJ = 64;
  private static String oHK = Environment.getExternalStorageDirectory().getAbsolutePath() + "/AVLog/dec264.h264";
  public static byte[] oHO = null;
  public static byte[] oHP = null;
  public static byte[] oHQ = null;
  public static int oHT = 640;
  public static int oHU = 480;
  private Surface aeJ;
  private BufferedOutputStream oHL = null;
  private BufferedOutputStream oHM = null;
  private MediaCodec oHN = null;
  public byte[] oHR = null;
  private boolean oHS = false;
  private boolean oHV = false;
  public boolean oHW = true;
  public boolean oHX = true;
  public boolean oHY = false;
  public int oHZ = 0;
  j oHa = null;
  public byte[] oIa = { 0, 0, 0, 1 };
  public int oIb = 0;
  public int oIc = 0;
  public int oId = 0;
  public byte[] oIe = { 103, 100, 0, 13, -84, -74, 10, 15, -120 };
  public byte[] oIf = { 0, 0, 0, 1, 40, -50, 60, 48 };
  public byte[] oIg = { 13, 0, -15, 98, -22 };
  
  public c(Surface paramSurface)
  {
    if (paramSurface != null) {
      this.aeJ = paramSurface;
    }
  }
  
  private static String aN(byte[] paramArrayOfByte)
  {
    String str1 = "";
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str3 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str2 = str3;
      if (str3.length() == 1) {
        str2 = "0" + str3;
      }
      str1 = str1 + str2;
      i += 1;
    }
    return str1;
  }
  
  private static boolean aO(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    paramArrayOfByte = aN(paramArrayOfByte);
    String str = aN(new byte[] { 0, 0, 3 });
    x.d("MeidaCodec[HWDec]", "parent: " + paramArrayOfByte + ", child:" + str);
    int i = paramArrayOfByte.indexOf(str, 0);
    if (i != -1)
    {
      x.d("MeidaCodec[HWDec]", "hack code detected!!pos: " + i);
      bool = true;
    }
    return bool;
  }
  
  private int bJy()
  {
    this.oHZ += 1;
    x.d("MeidaCodec[HWDec]", "[HW]:DecFrmError: I Req mIReqFlag = " + this.oHY + ", mIsHWDecEnable = " + this.oHW + ", mHWErrorDecFrmCount = " + this.oHZ);
    if ((!this.oHW) || (this.oHZ > oHJ))
    {
      bJz();
      this.oHa.bJU();
      this.oId |= 0x40;
      x.d("MeidaCodec[HWDec]", "[HW]:VTDecompressionSessionDecodeFrame: ErrFrm > threshold, end HWDec!!");
      return 0;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.put((byte)1);
    this.oHa.oJX.setAppCmd(28, localByteBuffer.array(), 1);
    this.oHY = true;
    return 1;
  }
  
  /* Error */
  public final int Q(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 95	com/tencent/mm/plugin/voip/model/c:oHW	Z
    //   4: ifne +22 -> 26
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   12: iconst_1
    //   13: ior
    //   14: putfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   17: ldc -9
    //   19: ldc -7
    //   21: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: iconst_m1
    //   25: ireturn
    //   26: invokestatic 255	java/lang/System:currentTimeMillis	()J
    //   29: pop2
    //   30: iload_2
    //   31: iconst_2
    //   32: if_icmpne +758 -> 790
    //   35: new 257	com/tencent/mm/protocal/c/alv
    //   38: dup
    //   39: invokespecial 258	com/tencent/mm/protocal/c/alv:<init>	()V
    //   42: aload_1
    //   43: invokevirtual 262	com/tencent/mm/protocal/c/alv:aG	([B)Lcom/tencent/mm/bk/a;
    //   46: checkcast 257	com/tencent/mm/protocal/c/alv
    //   49: astore_1
    //   50: aload_1
    //   51: getfield 266	com/tencent/mm/protocal/c/alv:rOo	Lcom/tencent/mm/bk/b;
    //   54: ifnonnull +440 -> 494
    //   57: iconst_0
    //   58: istore_2
    //   59: aload_1
    //   60: getfield 269	com/tencent/mm/protocal/c/alv:rOm	Lcom/tencent/mm/bk/b;
    //   63: getfield 274	com/tencent/mm/bk/b:lR	[B
    //   66: arraylength
    //   67: istore 4
    //   69: aload_1
    //   70: getfield 277	com/tencent/mm/protocal/c/alv:rOn	Lcom/tencent/mm/bk/b;
    //   73: getfield 274	com/tencent/mm/bk/b:lR	[B
    //   76: arraylength
    //   77: istore 5
    //   79: iload_2
    //   80: ifeq +426 -> 506
    //   83: aload_0
    //   84: getfield 91	com/tencent/mm/plugin/voip/model/c:oHS	Z
    //   87: ifne +8 -> 95
    //   90: aload_0
    //   91: iconst_0
    //   92: putfield 93	com/tencent/mm/plugin/voip/model/c:oHV	Z
    //   95: aload_0
    //   96: iconst_1
    //   97: putfield 91	com/tencent/mm/plugin/voip/model/c:oHS	Z
    //   100: iload_2
    //   101: iconst_4
    //   102: iadd
    //   103: newarray <illegal type>
    //   105: putstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   108: iload 4
    //   110: iconst_4
    //   111: iadd
    //   112: newarray <illegal type>
    //   114: putstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   117: iload 5
    //   119: iconst_4
    //   120: iadd
    //   121: newarray <illegal type>
    //   123: putstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   126: aload_0
    //   127: getfield 107	com/tencent/mm/plugin/voip/model/c:oIa	[B
    //   130: iconst_0
    //   131: getstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   134: iconst_0
    //   135: iconst_4
    //   136: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   139: aload_0
    //   140: getfield 107	com/tencent/mm/plugin/voip/model/c:oIa	[B
    //   143: iconst_0
    //   144: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   147: iconst_0
    //   148: iconst_4
    //   149: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   152: aload_0
    //   153: getfield 107	com/tencent/mm/plugin/voip/model/c:oIa	[B
    //   156: iconst_0
    //   157: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   160: iconst_0
    //   161: iconst_4
    //   162: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   165: aload_1
    //   166: getfield 266	com/tencent/mm/protocal/c/alv:rOo	Lcom/tencent/mm/bk/b;
    //   169: getstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   172: invokevirtual 285	com/tencent/mm/bk/b:bj	([B)V
    //   175: aload_1
    //   176: getfield 269	com/tencent/mm/protocal/c/alv:rOm	Lcom/tencent/mm/bk/b;
    //   179: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   182: invokevirtual 285	com/tencent/mm/bk/b:bj	([B)V
    //   185: aload_1
    //   186: getfield 277	com/tencent/mm/protocal/c/alv:rOn	Lcom/tencent/mm/bk/b;
    //   189: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   192: invokevirtual 285	com/tencent/mm/bk/b:bj	([B)V
    //   195: aload_0
    //   196: getstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   199: arraylength
    //   200: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   203: arraylength
    //   204: iadd
    //   205: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   208: arraylength
    //   209: iadd
    //   210: newarray <illegal type>
    //   212: putfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   215: getstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   218: iconst_0
    //   219: aload_0
    //   220: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   223: iconst_0
    //   224: getstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   227: arraylength
    //   228: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   231: getstatic 72	com/tencent/mm/plugin/voip/model/c:oHO	[B
    //   234: arraylength
    //   235: iconst_0
    //   236: iadd
    //   237: istore_2
    //   238: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   241: iconst_0
    //   242: aload_0
    //   243: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   246: iload_2
    //   247: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   250: arraylength
    //   251: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   254: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   257: arraylength
    //   258: istore 4
    //   260: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   263: iconst_0
    //   264: aload_0
    //   265: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   268: iload_2
    //   269: iload 4
    //   271: iadd
    //   272: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   275: arraylength
    //   276: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   279: aconst_null
    //   280: astore_1
    //   281: iconst_1
    //   282: istore_2
    //   283: aload_1
    //   284: ifnull +21 -> 305
    //   287: aload_0
    //   288: getfield 87	com/tencent/mm/plugin/voip/model/c:oHM	Ljava/io/BufferedOutputStream;
    //   291: ifnull +14 -> 305
    //   294: aload_0
    //   295: getfield 87	com/tencent/mm/plugin/voip/model/c:oHM	Ljava/io/BufferedOutputStream;
    //   298: aload_1
    //   299: iconst_0
    //   300: aload_1
    //   301: arraylength
    //   302: invokevirtual 291	java/io/BufferedOutputStream:write	([BII)V
    //   305: iload_2
    //   306: ifeq +930 -> 1236
    //   309: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   312: ifnull +924 -> 1236
    //   315: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   318: ifnull +918 -> 1236
    //   321: aload_0
    //   322: getfield 93	com/tencent/mm/plugin/voip/model/c:oHV	Z
    //   325: ifne +167 -> 492
    //   328: aload_0
    //   329: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   332: ifnull +22 -> 354
    //   335: aload_0
    //   336: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   339: invokevirtual 296	android/media/MediaCodec:stop	()V
    //   342: aload_0
    //   343: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   346: invokevirtual 299	android/media/MediaCodec:release	()V
    //   349: aload_0
    //   350: aconst_null
    //   351: putfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   354: aload_0
    //   355: getfield 91	com/tencent/mm/plugin/voip/model/c:oHS	Z
    //   358: ifeq +763 -> 1121
    //   361: ldc_w 301
    //   364: getstatic 78	com/tencent/mm/plugin/voip/model/c:oHT	I
    //   367: getstatic 80	com/tencent/mm/plugin/voip/model/c:oHU	I
    //   370: invokestatic 307	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   373: astore 11
    //   375: aload 11
    //   377: ldc_w 309
    //   380: bipush 90
    //   382: invokevirtual 313	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   385: ldc -90
    //   387: new 44	java/lang/StringBuilder
    //   390: dup
    //   391: ldc_w 315
    //   394: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   397: aload 11
    //   399: invokevirtual 318	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   402: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: invokestatic 321	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   408: aload 11
    //   410: ldc_w 323
    //   413: invokevirtual 327	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   416: astore 12
    //   418: aload 12
    //   420: ldc_w 329
    //   423: invokevirtual 333	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   426: ifeq +66 -> 492
    //   429: aload_0
    //   430: aload 12
    //   432: invokestatic 337	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   435: putfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   438: ldc -90
    //   440: new 44	java/lang/StringBuilder
    //   443: dup
    //   444: ldc_w 339
    //   447: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   450: aload 11
    //   452: invokevirtual 318	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   455: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   458: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   461: aload_0
    //   462: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   465: aload 11
    //   467: aload_0
    //   468: getfield 138	com/tencent/mm/plugin/voip/model/c:aeJ	Landroid/view/Surface;
    //   471: aconst_null
    //   472: iconst_0
    //   473: invokevirtual 343	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   476: aload_0
    //   477: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   480: invokevirtual 346	android/media/MediaCodec:start	()V
    //   483: aload_0
    //   484: iconst_1
    //   485: putfield 93	com/tencent/mm/plugin/voip/model/c:oHV	Z
    //   488: aload_0
    //   489: invokevirtual 347	com/tencent/mm/plugin/voip/model/c:start	()V
    //   492: iconst_1
    //   493: ireturn
    //   494: aload_1
    //   495: getfield 266	com/tencent/mm/protocal/c/alv:rOo	Lcom/tencent/mm/bk/b;
    //   498: getfield 274	com/tencent/mm/bk/b:lR	[B
    //   501: arraylength
    //   502: istore_2
    //   503: goto -444 -> 59
    //   506: aload_0
    //   507: getfield 91	com/tencent/mm/plugin/voip/model/c:oHS	Z
    //   510: ifeq +8 -> 518
    //   513: aload_0
    //   514: iconst_0
    //   515: putfield 93	com/tencent/mm/plugin/voip/model/c:oHV	Z
    //   518: aload_0
    //   519: iconst_0
    //   520: putfield 91	com/tencent/mm/plugin/voip/model/c:oHS	Z
    //   523: iload 4
    //   525: iconst_4
    //   526: iadd
    //   527: newarray <illegal type>
    //   529: astore 11
    //   531: aload_0
    //   532: getfield 107	com/tencent/mm/plugin/voip/model/c:oIa	[B
    //   535: iconst_0
    //   536: aload 11
    //   538: iconst_0
    //   539: iconst_4
    //   540: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   543: aload_1
    //   544: getfield 269	com/tencent/mm/protocal/c/alv:rOm	Lcom/tencent/mm/bk/b;
    //   547: aload 11
    //   549: invokevirtual 285	com/tencent/mm/bk/b:bj	([B)V
    //   552: ldc -90
    //   554: new 44	java/lang/StringBuilder
    //   557: dup
    //   558: ldc_w 349
    //   561: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   564: aload 11
    //   566: invokevirtual 318	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   569: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   572: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   575: aload 11
    //   577: invokestatic 351	com/tencent/mm/plugin/voip/model/c:aO	([B)Z
    //   580: ifeq +184 -> 764
    //   583: ldc -90
    //   585: ldc_w 353
    //   588: invokestatic 321	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   591: aload 11
    //   593: putstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   596: ldc -90
    //   598: new 44	java/lang/StringBuilder
    //   601: dup
    //   602: ldc_w 355
    //   605: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   608: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   611: arraylength
    //   612: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   615: ldc_w 357
    //   618: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: iload 4
    //   623: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   626: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   629: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   632: iload 5
    //   634: iconst_4
    //   635: iadd
    //   636: newarray <illegal type>
    //   638: putstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   641: aload_0
    //   642: getfield 107	com/tencent/mm/plugin/voip/model/c:oIa	[B
    //   645: iconst_0
    //   646: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   649: iconst_0
    //   650: iconst_4
    //   651: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   654: aload_1
    //   655: getfield 277	com/tencent/mm/protocal/c/alv:rOn	Lcom/tencent/mm/bk/b;
    //   658: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   661: invokevirtual 285	com/tencent/mm/bk/b:bj	([B)V
    //   664: aload_0
    //   665: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   668: arraylength
    //   669: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   672: arraylength
    //   673: iadd
    //   674: newarray <illegal type>
    //   676: putfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   679: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   682: iconst_0
    //   683: aload_0
    //   684: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   687: iconst_0
    //   688: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   691: arraylength
    //   692: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   695: getstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   698: arraylength
    //   699: istore_2
    //   700: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   703: iconst_0
    //   704: aload_0
    //   705: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   708: iload_2
    //   709: iconst_0
    //   710: iadd
    //   711: getstatic 76	com/tencent/mm/plugin/voip/model/c:oHQ	[B
    //   714: arraylength
    //   715: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   718: goto -439 -> 279
    //   721: astore_1
    //   722: aload_0
    //   723: aload_0
    //   724: getfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   727: iconst_2
    //   728: ior
    //   729: putfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   732: ldc -90
    //   734: new 44	java/lang/StringBuilder
    //   737: dup
    //   738: ldc_w 359
    //   741: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   744: aload_1
    //   745: invokevirtual 360	java/lang/Exception:toString	()Ljava/lang/String;
    //   748: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   751: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   754: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   757: aconst_null
    //   758: astore_1
    //   759: iconst_0
    //   760: istore_2
    //   761: goto -478 -> 283
    //   764: new 365	com/tencent/mm/plugin/voip/model/f
    //   767: dup
    //   768: invokespecial 366	com/tencent/mm/plugin/voip/model/f:<init>	()V
    //   771: pop
    //   772: new 368	java/io/ByteArrayInputStream
    //   775: dup
    //   776: aload 11
    //   778: invokespecial 370	java/io/ByteArrayInputStream:<init>	([B)V
    //   781: invokestatic 374	com/tencent/mm/plugin/voip/model/f:v	(Ljava/io/InputStream;)[B
    //   784: putstatic 74	com/tencent/mm/plugin/voip/model/c:oHP	[B
    //   787: goto -191 -> 596
    //   790: new 376	com/tencent/mm/protocal/c/alu
    //   793: dup
    //   794: invokespecial 377	com/tencent/mm/protocal/c/alu:<init>	()V
    //   797: aload_1
    //   798: invokevirtual 378	com/tencent/mm/protocal/c/alu:aG	([B)Lcom/tencent/mm/bk/a;
    //   801: checkcast 376	com/tencent/mm/protocal/c/alu
    //   804: astore 11
    //   806: aload 11
    //   808: getfield 382	com/tencent/mm/protocal/c/alu:rOk	Ljava/util/LinkedList;
    //   811: invokevirtual 388	java/util/LinkedList:getFirst	()Ljava/lang/Object;
    //   814: checkcast 144	java/lang/Integer
    //   817: invokevirtual 391	java/lang/Integer:intValue	()I
    //   820: istore 6
    //   822: iconst_0
    //   823: istore 4
    //   825: ldc -90
    //   827: new 44	java/lang/StringBuilder
    //   830: dup
    //   831: ldc_w 393
    //   834: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   837: iload 6
    //   839: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   842: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   845: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   848: iload_2
    //   849: iconst_1
    //   850: if_icmpne +185 -> 1035
    //   853: aload_0
    //   854: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   857: arraylength
    //   858: istore 4
    //   860: iload 6
    //   862: iload 4
    //   864: iadd
    //   865: istore 5
    //   867: iload 5
    //   869: newarray <illegal type>
    //   871: astore_1
    //   872: aload_0
    //   873: getfield 89	com/tencent/mm/plugin/voip/model/c:oHR	[B
    //   876: iconst_0
    //   877: aload_1
    //   878: iconst_0
    //   879: iload 4
    //   881: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   884: iload 4
    //   886: iconst_0
    //   887: iadd
    //   888: istore 4
    //   890: goto +782 -> 1672
    //   893: iconst_4
    //   894: invokestatic 211	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   897: astore 12
    //   899: aload 11
    //   901: getfield 396	com/tencent/mm/protocal/c/alu:rOh	Lcom/tencent/mm/bk/b;
    //   904: aload 12
    //   906: invokevirtual 233	java/nio/ByteBuffer:array	()[B
    //   909: iload 6
    //   911: iconst_0
    //   912: iconst_4
    //   913: invokevirtual 400	com/tencent/mm/bk/b:f	([BIII)V
    //   916: aload 12
    //   918: getstatic 403	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   921: invokevirtual 221	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   924: pop
    //   925: aload 12
    //   927: iconst_0
    //   928: invokevirtual 407	java/nio/ByteBuffer:getInt	(I)I
    //   931: istore 8
    //   933: aload_0
    //   934: getfield 107	com/tencent/mm/plugin/voip/model/c:oIa	[B
    //   937: iconst_0
    //   938: aload_1
    //   939: iload 6
    //   941: iload 4
    //   943: iadd
    //   944: iconst_4
    //   945: invokestatic 281	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   948: iload 6
    //   950: iconst_4
    //   951: iadd
    //   952: istore 6
    //   954: aload 11
    //   956: getfield 396	com/tencent/mm/protocal/c/alu:rOh	Lcom/tencent/mm/bk/b;
    //   959: aload_1
    //   960: iload 6
    //   962: iload 6
    //   964: iload 4
    //   966: iadd
    //   967: iload 8
    //   969: invokevirtual 400	com/tencent/mm/bk/b:f	([BIII)V
    //   972: iload 7
    //   974: iload 8
    //   976: iconst_4
    //   977: iadd
    //   978: isub
    //   979: istore 7
    //   981: ldc -90
    //   983: new 44	java/lang/StringBuilder
    //   986: dup
    //   987: ldc_w 409
    //   990: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   993: iload 8
    //   995: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   998: ldc_w 411
    //   1001: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1004: iload 5
    //   1006: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1009: ldc_w 413
    //   1012: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1015: iload_2
    //   1016: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1019: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1022: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1025: iload 7
    //   1027: ifgt +635 -> 1662
    //   1030: iconst_0
    //   1031: istore_2
    //   1032: goto -749 -> 283
    //   1035: iload 6
    //   1037: newarray <illegal type>
    //   1039: astore_1
    //   1040: iload 6
    //   1042: istore 5
    //   1044: goto +628 -> 1672
    //   1047: astore_1
    //   1048: aload_0
    //   1049: aload_0
    //   1050: getfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1053: iconst_4
    //   1054: ior
    //   1055: putfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1058: ldc -90
    //   1060: new 44	java/lang/StringBuilder
    //   1063: dup
    //   1064: ldc_w 415
    //   1067: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1070: aload_1
    //   1071: invokevirtual 360	java/lang/Exception:toString	()Ljava/lang/String;
    //   1074: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1077: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1080: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1083: aconst_null
    //   1084: astore_1
    //   1085: iconst_0
    //   1086: istore_2
    //   1087: goto -804 -> 283
    //   1090: astore 11
    //   1092: ldc -90
    //   1094: new 44	java/lang/StringBuilder
    //   1097: dup
    //   1098: ldc_w 417
    //   1101: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1104: aload 11
    //   1106: invokevirtual 418	java/io/IOException:toString	()Ljava/lang/String;
    //   1109: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1112: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1115: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1118: goto -813 -> 305
    //   1121: ldc_w 420
    //   1124: getstatic 78	com/tencent/mm/plugin/voip/model/c:oHT	I
    //   1127: getstatic 80	com/tencent/mm/plugin/voip/model/c:oHU	I
    //   1130: invokestatic 307	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   1133: astore 11
    //   1135: goto -760 -> 375
    //   1138: astore 11
    //   1140: aload_0
    //   1141: aload_0
    //   1142: getfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1145: bipush 8
    //   1147: ior
    //   1148: putfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1151: ldc -90
    //   1153: new 44	java/lang/StringBuilder
    //   1156: dup
    //   1157: ldc_w 422
    //   1160: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1163: aload 12
    //   1165: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1168: ldc_w 424
    //   1171: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1174: aload 11
    //   1176: invokevirtual 318	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1179: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1182: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1185: aload_0
    //   1186: iconst_0
    //   1187: putfield 95	com/tencent/mm/plugin/voip/model/c:oHW	Z
    //   1190: aload_0
    //   1191: invokespecial 426	com/tencent/mm/plugin/voip/model/c:bJy	()I
    //   1194: pop
    //   1195: iconst_m1
    //   1196: ireturn
    //   1197: astore 11
    //   1199: aload_0
    //   1200: aload_0
    //   1201: getfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1204: bipush 16
    //   1206: ior
    //   1207: putfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1210: ldc -90
    //   1212: new 44	java/lang/StringBuilder
    //   1215: dup
    //   1216: ldc_w 417
    //   1219: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1222: aload 11
    //   1224: invokevirtual 360	java/lang/Exception:toString	()Ljava/lang/String;
    //   1227: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1230: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1233: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1236: aload_0
    //   1237: getfield 93	com/tencent/mm/plugin/voip/model/c:oHV	Z
    //   1240: ifne +13 -> 1253
    //   1243: ldc -90
    //   1245: ldc_w 428
    //   1248: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1251: iconst_m1
    //   1252: ireturn
    //   1253: aload_0
    //   1254: getfield 97	com/tencent/mm/plugin/voip/model/c:oHX	Z
    //   1257: ifne +8 -> 1265
    //   1260: aload_0
    //   1261: iconst_1
    //   1262: putfield 97	com/tencent/mm/plugin/voip/model/c:oHX	Z
    //   1265: aload_1
    //   1266: arraylength
    //   1267: istore_2
    //   1268: aload_1
    //   1269: iconst_4
    //   1270: baload
    //   1271: bipush 31
    //   1273: iand
    //   1274: istore 4
    //   1276: iload 4
    //   1278: bipush 7
    //   1280: if_icmpeq +10 -> 1290
    //   1283: iload 4
    //   1285: bipush 8
    //   1287: if_icmpne +86 -> 1373
    //   1290: bipush 83
    //   1292: istore_3
    //   1293: ldc -90
    //   1295: new 44	java/lang/StringBuilder
    //   1298: dup
    //   1299: ldc_w 430
    //   1302: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1305: iload_2
    //   1306: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1309: ldc_w 432
    //   1312: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1315: iload 4
    //   1317: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1320: ldc_w 434
    //   1323: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1326: iload_3
    //   1327: invokevirtual 437	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1330: ldc_w 439
    //   1333: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1336: aload_0
    //   1337: getfield 111	com/tencent/mm/plugin/voip/model/c:oIc	I
    //   1340: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1343: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1346: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1349: aload_0
    //   1350: getfield 99	com/tencent/mm/plugin/voip/model/c:oHY	Z
    //   1353: ifeq +45 -> 1398
    //   1356: iload_3
    //   1357: bipush 80
    //   1359: if_icmpne +39 -> 1398
    //   1362: ldc -90
    //   1364: ldc_w 441
    //   1367: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1370: bipush -2
    //   1372: ireturn
    //   1373: iload 4
    //   1375: iconst_5
    //   1376: if_icmpeq +10 -> 1386
    //   1379: iload 4
    //   1381: bipush 6
    //   1383: if_icmpne +9 -> 1392
    //   1386: bipush 73
    //   1388: istore_3
    //   1389: goto -96 -> 1293
    //   1392: bipush 80
    //   1394: istore_3
    //   1395: goto -102 -> 1293
    //   1398: aload_0
    //   1399: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   1402: ldc2_w 442
    //   1405: invokevirtual 447	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   1408: istore 4
    //   1410: iload 4
    //   1412: iflt +205 -> 1617
    //   1415: aload_1
    //   1416: ifnull +185 -> 1601
    //   1419: iload_2
    //   1420: ifle +181 -> 1601
    //   1423: invokestatic 255	java/lang/System:currentTimeMillis	()J
    //   1426: lstore 9
    //   1428: ldc -90
    //   1430: new 44	java/lang/StringBuilder
    //   1433: dup
    //   1434: ldc_w 449
    //   1437: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1440: iload 4
    //   1442: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1445: ldc_w 451
    //   1448: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1451: iload_2
    //   1452: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1455: ldc_w 434
    //   1458: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: iload_3
    //   1462: invokevirtual 437	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1465: ldc_w 453
    //   1468: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1471: lload 9
    //   1473: invokevirtual 456	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1476: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1479: invokestatic 176	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1482: getstatic 461	android/os/Build$VERSION:SDK_INT	I
    //   1485: bipush 21
    //   1487: if_icmpge +116 -> 1603
    //   1490: aload_0
    //   1491: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   1494: invokevirtual 465	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   1497: iload 4
    //   1499: aaload
    //   1500: astore 11
    //   1502: aload 11
    //   1504: invokevirtual 469	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   1507: pop
    //   1508: aload 11
    //   1510: invokevirtual 469	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   1513: pop
    //   1514: aload 11
    //   1516: aload_1
    //   1517: iconst_0
    //   1518: iload_2
    //   1519: invokevirtual 472	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   1522: pop
    //   1523: aload_0
    //   1524: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   1527: iload 4
    //   1529: iconst_0
    //   1530: iload_2
    //   1531: lload 9
    //   1533: iconst_0
    //   1534: invokevirtual 476	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   1537: aload_0
    //   1538: aload_0
    //   1539: getfield 111	com/tencent/mm/plugin/voip/model/c:oIc	I
    //   1542: iconst_1
    //   1543: iadd
    //   1544: putfield 111	com/tencent/mm/plugin/voip/model/c:oIc	I
    //   1547: aload_0
    //   1548: iconst_0
    //   1549: putfield 101	com/tencent/mm/plugin/voip/model/c:oHZ	I
    //   1552: aload_0
    //   1553: getfield 99	com/tencent/mm/plugin/voip/model/c:oHY	Z
    //   1556: ifeq +45 -> 1601
    //   1559: iconst_1
    //   1560: invokestatic 211	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   1563: astore_1
    //   1564: aload_1
    //   1565: getstatic 217	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   1568: invokevirtual 221	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   1571: pop
    //   1572: aload_1
    //   1573: iconst_0
    //   1574: invokevirtual 225	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   1577: pop
    //   1578: aload_0
    //   1579: getfield 103	com/tencent/mm/plugin/voip/model/c:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   1582: getfield 229	com/tencent/mm/plugin/voip/model/j:oJX	Lcom/tencent/mm/plugin/voip/model/v2protocal;
    //   1585: bipush 28
    //   1587: aload_1
    //   1588: invokevirtual 233	java/nio/ByteBuffer:array	()[B
    //   1591: iconst_1
    //   1592: invokevirtual 239	com/tencent/mm/plugin/voip/model/v2protocal:setAppCmd	(I[BI)I
    //   1595: pop
    //   1596: aload_0
    //   1597: iconst_0
    //   1598: putfield 99	com/tencent/mm/plugin/voip/model/c:oHY	Z
    //   1601: iconst_0
    //   1602: ireturn
    //   1603: aload_0
    //   1604: getfield 136	com/tencent/mm/plugin/voip/model/c:oHN	Landroid/media/MediaCodec;
    //   1607: iload 4
    //   1609: invokevirtual 479	android/media/MediaCodec:getInputBuffer	(I)Ljava/nio/ByteBuffer;
    //   1612: astore 11
    //   1614: goto -106 -> 1508
    //   1617: aload_0
    //   1618: getfield 99	com/tencent/mm/plugin/voip/model/c:oHY	Z
    //   1621: ifeq +25 -> 1646
    //   1624: iload_3
    //   1625: bipush 80
    //   1627: if_icmpeq +19 -> 1646
    //   1630: aload_0
    //   1631: iconst_0
    //   1632: putfield 95	com/tencent/mm/plugin/voip/model/c:oHW	Z
    //   1635: aload_0
    //   1636: aload_0
    //   1637: getfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1640: bipush 32
    //   1642: ior
    //   1643: putfield 113	com/tencent/mm/plugin/voip/model/c:oId	I
    //   1646: aload_0
    //   1647: invokespecial 426	com/tencent/mm/plugin/voip/model/c:bJy	()I
    //   1650: pop
    //   1651: ldc -90
    //   1653: ldc_w 481
    //   1656: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1659: goto -58 -> 1601
    //   1662: iload 6
    //   1664: iload 8
    //   1666: iadd
    //   1667: istore 6
    //   1669: goto -776 -> 893
    //   1672: iconst_0
    //   1673: istore 8
    //   1675: iload 6
    //   1677: istore 7
    //   1679: iload 8
    //   1681: istore 6
    //   1683: goto -790 -> 893
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1686	0	this	c
    //   0	1686	1	paramArrayOfByte	byte[]
    //   0	1686	2	paramInt	int
    //   1292	336	3	c	char
    //   67	1541	4	i	int
    //   77	966	5	j	int
    //   820	862	6	k	int
    //   972	706	7	m	int
    //   931	749	8	n	int
    //   1426	106	9	l	long
    //   373	582	11	localObject1	Object
    //   1090	15	11	localIOException	IOException
    //   1133	1	11	localMediaFormat	android.media.MediaFormat
    //   1138	37	11	localException1	Exception
    //   1197	26	11	localException2	Exception
    //   1500	113	11	localByteBuffer	ByteBuffer
    //   416	748	12	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   35	57	721	java/lang/Exception
    //   59	79	721	java/lang/Exception
    //   83	95	721	java/lang/Exception
    //   95	279	721	java/lang/Exception
    //   494	503	721	java/lang/Exception
    //   506	518	721	java/lang/Exception
    //   518	596	721	java/lang/Exception
    //   596	718	721	java/lang/Exception
    //   764	787	721	java/lang/Exception
    //   790	822	1047	java/lang/Exception
    //   825	848	1047	java/lang/Exception
    //   853	860	1047	java/lang/Exception
    //   867	884	1047	java/lang/Exception
    //   893	948	1047	java/lang/Exception
    //   954	972	1047	java/lang/Exception
    //   981	1025	1047	java/lang/Exception
    //   1035	1040	1047	java/lang/Exception
    //   294	305	1090	java/io/IOException
    //   438	476	1138	java/lang/Exception
    //   309	354	1197	java/lang/Exception
    //   354	375	1197	java/lang/Exception
    //   375	438	1197	java/lang/Exception
    //   476	492	1197	java/lang/Exception
    //   1121	1135	1197	java/lang/Exception
    //   1140	1195	1197	java/lang/Exception
  }
  
  public final void a(j paramj)
  {
    this.oHa = paramj;
    x.i("MeidaCodec[HWDec]", "setCallBack");
  }
  
  public final void bJz()
  {
    this.oHW = false;
    this.oHX = false;
    this.oHZ = 0;
    x.d("MeidaCodec[HWDec]", "steve: Stop Decode Thread!");
    try
    {
      if (this.oHL != null)
      {
        this.oHL.flush();
        this.oHL.close();
      }
      if (this.oHM != null)
      {
        this.oHM.flush();
        this.oHM.close();
      }
      return;
    }
    catch (IOException localIOException)
    {
      x.e("MeidaCodec[HWDec]", " error:" + localIOException.toString());
    }
  }
  
  @SuppressLint({"NewApi"})
  public final void run()
  {
    if ((!Thread.interrupted()) && (this.oHW)) {
      if ((this.oHN == null) || (!this.oHV) || (!this.oHX)) {}
    }
    for (;;)
    {
      int i;
      try
      {
        MediaCodec.BufferInfo localBufferInfo = new MediaCodec.BufferInfo();
        i = this.oHN.dequeueOutputBuffer(localBufferInfo, 10000L);
        x.d("MeidaCodec[HWDec]", "steve:  outIndex=" + i);
        switch (i)
        {
        case -3: 
          if (localBufferInfo.size <= 0) {
            break label371;
          }
          long l1 = localBufferInfo.presentationTimeUs;
          long l2 = System.currentTimeMillis();
          x.d("MeidaCodec[HWDec]", "DECODER_THREAD:: decoded SUCCESSFULLY!!! cnt : " + this.oIb + ", size:" + localBufferInfo.size + ", pts:" + localBufferInfo.presentationTimeUs + ", latency:" + (l2 - l1));
          this.oIb += 1;
          this.oHN.releaseOutputBuffer(i, true);
          l2 = System.currentTimeMillis();
          x.d("MeidaCodec[HWDec]", "steve: Avcdecoder frame processTime = " + (l2 - l1) + ", decFrameCnt=" + this.oIb + ", endTime=" + l2);
        }
      }
      catch (Exception localException)
      {
        this.oHW = false;
        this.oId |= 0x80;
        bJy();
        x.e("MeidaCodec[HWDec]", " dequeueOutputBuffer/releaseOutputBuffer error:" + localException.toString());
      }
      break;
      x.d("MeidaCodec[HWDec]", "INFO_OUTPUT_BUFFERS_CHANGED");
      break;
      x.d("MeidaCodec[HWDec]", "DECODER_THREAD:: New format : " + this.oHN.getOutputFormat());
      break;
      x.d("MeidaCodec[HWDec]", "DECODER_THREAD:: dequeueOutputBuffer timed out!");
      break;
      label371:
      x.d("MeidaCodec[HWDec]", "steve: drop frame: " + this.oIb + ", size:" + localException.size + ", pts:" + localException.presentationTimeUs);
      this.oHN.releaseOutputBuffer(i, false);
      break;
      try
      {
        Thread.sleep(20L);
      }
      catch (InterruptedException localInterruptedException)
      {
        x.e("MeidaCodec[HWDec]", " error:" + localInterruptedException.toString());
      }
      break;
      if ((!this.oHW) && (this.oHN != null))
      {
        this.oHN.stop();
        this.oHN.release();
        this.oHN = null;
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */