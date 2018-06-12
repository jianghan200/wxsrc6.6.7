package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.os.Process;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.vfs.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class MMBitmapFactory
{
  public static final int DECODER_ID_MMJPEG_DECODER = 2;
  public static final int DECODER_ID_MMPNG_DECODER = 0;
  public static final int DECODER_ID_MMVCODEC_DECODER = 1;
  private static final Bitmap.Config DEFAULT_BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
  private static final int DEFAULT_CHECK_STORAGE_SIZE = 8192;
  private static final int DEFAULT_DECODE_MARK_SIZE = 8388608;
  private static final int DEFAULT_DECODE_STORAGE_SIZE = 8192;
  public static final int DEFAULT_DECODE_STRATEGY = 1;
  public static final int ERROR_ALLOCATE_STRUCT_FAILED = 1001;
  public static final int ERROR_BEGIN_SAMPLE_FAILED = 1004;
  public static final int ERROR_GET_PIXEL_FORMAT_FAILED = 1003;
  public static final int ERROR_ILLEGAL_IDATA_CHUNK = 2003;
  public static final int ERROR_ILLEGAL_IMAGE_SIZE = 1008;
  public static final int ERROR_ILLEGAL_NPTC_CHUNK = 2002;
  public static final int ERROR_IMAGE_SIZE_IS_TOO_LARGE = 1007;
  public static final int ERROR_IMG_BUG_DETECTED_BEGIN = 2000;
  public static final int ERROR_IO_FAILED = 1005;
  public static final int ERROR_LOCK_BITMAP_FAILED = 1002;
  public static final int ERROR_PNG_BUG_DETECTED_BEGIN = 2001;
  public static final int ERROR_SUCCESS = 0;
  public static final int ERROR_UNSUPPORT_IMAGE_FORMAT = 1006;
  private static final int ERROR_USER_DEFINED_BEGIN = 3000;
  public static final int STRATEGY_AUTO_DETECT = 0;
  public static final int STRATEGY_FORCE_SYSTEM_DECODER = 1;
  private static final String TAG = "MicroMsg.MMBitmapFactory";
  private static boolean mIsInit = false;
  static Method mMthGetDefaultDensity = null;
  
  private static boolean checkIfHaveToUseMMDecoder(BitmapFactory.Options paramOptions)
  {
    if (paramOptions != null) {}
    for (String str = paramOptions.outMimeType;; str = "")
    {
      x.d("MicroMsg.MMBitmapFactory", "mimetype: %s", new Object[] { str });
      if ((paramOptions == null) || (paramOptions.outMimeType == null) || ((!paramOptions.outMimeType.toLowerCase().endsWith("png")) && (!paramOptions.outMimeType.toLowerCase().endsWith("vcodec")))) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public static boolean checkIsImageLegal(InputStream paramInputStream)
  {
    return checkIsImageLegal(paramInputStream, null);
  }
  
  public static boolean checkIsImageLegal(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger)
  {
    return checkIsImageLegalInternal(paramInputStream, paramDecodeResultLogger);
  }
  
  public static boolean checkIsImageLegal(String paramString)
  {
    return checkIsImageLegal(paramString, null);
  }
  
  /* Error */
  public static boolean checkIsImageLegal(String paramString, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +24 -> 25
    //   4: ldc 64
    //   6: ldc -125
    //   8: invokestatic 135	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   11: aload_1
    //   12: ifnull +11 -> 23
    //   15: aload_1
    //   16: sipush 1005
    //   19: invokestatic 139	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$002	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)I
    //   22: pop
    //   23: iconst_0
    //   24: ireturn
    //   25: new 141	java/io/BufferedInputStream
    //   28: dup
    //   29: new 143	com/tencent/mm/vfs/c
    //   32: dup
    //   33: aload_0
    //   34: invokespecial 146	com/tencent/mm/vfs/c:<init>	(Ljava/lang/String;)V
    //   37: invokespecial 149	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: astore 6
    //   42: aload 6
    //   44: astore 5
    //   46: invokestatic 155	java/lang/System:currentTimeMillis	()J
    //   49: lstore_2
    //   50: aload 6
    //   52: astore 5
    //   54: aload 6
    //   56: aload_1
    //   57: invokestatic 124	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegalInternal	(Ljava/io/InputStream;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Z
    //   60: istore 4
    //   62: aload 6
    //   64: astore 5
    //   66: ldc 64
    //   68: ldc -99
    //   70: iconst_3
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_0
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: iload 4
    //   82: invokestatic 163	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   85: aastore
    //   86: dup
    //   87: iconst_2
    //   88: invokestatic 155	java/lang/System:currentTimeMillis	()J
    //   91: lload_2
    //   92: lsub
    //   93: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   96: aastore
    //   97: invokestatic 100	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload 6
    //   102: invokestatic 173	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   105: iload 4
    //   107: ireturn
    //   108: astore 7
    //   110: aconst_null
    //   111: astore_0
    //   112: aload_0
    //   113: astore 5
    //   115: ldc 64
    //   117: aload 7
    //   119: ldc -81
    //   121: iconst_0
    //   122: anewarray 4	java/lang/Object
    //   125: invokestatic 179	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: aload_1
    //   129: ifnull +14 -> 143
    //   132: aload_0
    //   133: astore 5
    //   135: aload_1
    //   136: sipush 1005
    //   139: invokestatic 139	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$002	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)I
    //   142: pop
    //   143: aload_0
    //   144: invokestatic 173	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   147: iconst_0
    //   148: ireturn
    //   149: astore_0
    //   150: aconst_null
    //   151: astore 5
    //   153: aload 5
    //   155: invokestatic 173	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   158: aload_0
    //   159: athrow
    //   160: astore_0
    //   161: goto -8 -> 153
    //   164: astore 7
    //   166: aload 6
    //   168: astore_0
    //   169: goto -57 -> 112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	paramString	String
    //   0	172	1	paramDecodeResultLogger	DecodeResultLogger
    //   49	43	2	l	long
    //   60	46	4	bool	boolean
    //   44	110	5	localObject	Object
    //   40	127	6	localBufferedInputStream	BufferedInputStream
    //   108	10	7	localFileNotFoundException1	FileNotFoundException
    //   164	1	7	localFileNotFoundException2	FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   25	42	108	java/io/FileNotFoundException
    //   25	42	149	finally
    //   46	50	160	finally
    //   54	62	160	finally
    //   66	100	160	finally
    //   115	128	160	finally
    //   135	143	160	finally
    //   46	50	164	java/io/FileNotFoundException
    //   54	62	164	java/io/FileNotFoundException
    //   66	100	164	java/io/FileNotFoundException
  }
  
  public static boolean checkIsImageLegal(byte[] paramArrayOfByte)
  {
    return checkIsImageLegal(paramArrayOfByte, null);
  }
  
  public static boolean checkIsImageLegal(byte[] paramArrayOfByte, DecodeResultLogger paramDecodeResultLogger)
  {
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.MMBitmapFactory", "buf is null.");
      if (paramDecodeResultLogger != null) {
        DecodeResultLogger.access$002(paramDecodeResultLogger, 1005);
      }
      return false;
    }
    return checkIsImageLegalInternal(new ByteArrayInputStream(paramArrayOfByte), paramDecodeResultLogger);
  }
  
  private static boolean checkIsImageLegalInternal(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger)
  {
    if (paramInputStream == null)
    {
      x.e("MicroMsg.MMBitmapFactory", "InputStream is null.");
      if (paramDecodeResultLogger != null) {
        DecodeResultLogger.access$002(paramDecodeResultLogger, 1005);
      }
    }
    int i;
    do
    {
      return false;
      if (!DynamicConfigStorage.getValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false)) {
        return true;
      }
      i = nativeCheckIsImageLegal(paramInputStream, new byte[' '], paramDecodeResultLogger);
    } while ((i != 0) && (i != 1006));
    return true;
  }
  
  private static void checkIsInit()
  {
    if (!mIsInit) {
      x.w("MicroMsg.MMBitmapFactory", "MMBitmapFactory is not initialized.");
    }
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, null, 1, new int[0]);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, null, paramInt3, new int[0]);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, null, 1, new int[0]);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, int paramInt3)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, null, paramInt3, new int[0]);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, 1, new int[0]);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    boolean bool = HardCoderJNI.hcDecodePicEnable;
    int j = HardCoderJNI.hcDecodePicDelay;
    int k = HardCoderJNI.hcDecodePicCPU;
    int m = HardCoderJNI.hcDecodePicIO;
    if (HardCoderJNI.hcDecodePicThr) {}
    for (int i = Process.myTid();; i = 0)
    {
      i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDecodePicTimeout, 601, HardCoderJNI.hcDecodePicAction, "MicroMsg.MMBitmapFactory");
      long l = System.currentTimeMillis();
      paramArrayOfByte = decodeByteArrayInternal(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, paramInt3, paramVarArgs);
      x.i("MicroMsg.MMBitmapFactory", "decode done, size:%d, cost:%d ms", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis() - l) });
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDecodePicEnable, i);
      return paramArrayOfByte;
    }
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, DecodeResultLogger paramDecodeResultLogger)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, paramDecodeResultLogger, 1, new int[0]);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    return decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, paramDecodeResultLogger, paramInt3, paramVarArgs);
  }
  
  private static Bitmap decodeByteArrayInternal(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    checkIsInit();
    boolean bool = DynamicConfigStorage.getValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false);
    if (bool)
    {
      switch (paramInt3)
      {
      default: 
        x.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
        return decodeByteArrayWithSystemDecoder(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger);
      }
      return decodeByteArrayWithMMDecoderIfPossible(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, paramVarArgs);
    }
    x.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly since strategy, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
    return decodeByteArrayWithSystemDecoder(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger);
  }
  
  private static Bitmap decodeByteArrayWithMMDecoderIfPossible(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs)
  {
    if (paramDecodeResultLogger == null) {
      for (;;)
      {
        try
        {
          localObject = new DecodeResultLogger();
          paramDecodeResultLogger = (DecodeResultLogger)localObject;
        }
        catch (Exception paramArrayOfByte)
        {
          Object localObject;
          label166:
          paramVarArgs = null;
          continue;
        }
        try
        {
          localObject = nativeDecodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, paramVarArgs);
          paramVarArgs = (int[])localObject;
          try
          {
            if (paramDecodeResultLogger.mDecodeResultCode == 0) {
              continue;
            }
            paramVarArgs = (int[])localObject;
            if (paramDecodeResultLogger.mDecodeResultCode >= 2000) {
              continue;
            }
            paramVarArgs = (int[])localObject;
            x.i("MicroMsg.MMBitmapFactory", "mmimgdec decoder decodes failed, try system BitmapFactory.");
            paramVarArgs = (int[])localObject;
            DecodeResultLogger.access$102(paramDecodeResultLogger, false);
            paramVarArgs = (int[])localObject;
            localObject = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions);
            if (localObject == null)
            {
              if (paramOptions != null)
              {
                paramVarArgs = (int[])localObject;
                if (paramOptions.inJustDecodeBounds)
                {
                  paramVarArgs = (int[])localObject;
                  if (paramOptions.outWidth >= 0)
                  {
                    paramVarArgs = (int[])localObject;
                    if (paramOptions.outHeight < 0) {}
                  }
                }
              }
            }
            else
            {
              paramVarArgs = (int[])localObject;
              x.i("MicroMsg.MMBitmapFactory", "System decoder decodes success.");
              paramVarArgs = (int[])localObject;
              DecodeResultLogger.access$002(paramDecodeResultLogger, 0);
              paramArrayOfByte = paramDecodeResultLogger;
              paramVarArgs = (int[])localObject;
              x.i("MicroMsg.MMBitmapFactory", paramArrayOfByte.toLogString());
              return paramVarArgs;
            }
            paramVarArgs = (int[])localObject;
            x.w("MicroMsg.MMBitmapFactory", "System decoder decodes failed.");
            paramVarArgs = (int[])localObject;
            DecodeResultLogger.access$002(paramDecodeResultLogger, 1006);
            paramVarArgs = (int[])localObject;
            paramArrayOfByte = paramDecodeResultLogger;
            continue;
            x.printErrStackTrace("MicroMsg.MMBitmapFactory", paramArrayOfByte, "An exception was thrown when decode image.", new Object[0]);
          }
          catch (Exception paramArrayOfByte) {}
        }
        catch (Exception paramArrayOfByte)
        {
          paramVarArgs = null;
          continue;
        }
        DecodeResultLogger.access$002(paramDecodeResultLogger, 1005);
        paramArrayOfByte = paramDecodeResultLogger;
        continue;
        paramVarArgs = (int[])localObject;
        x.i("MicroMsg.MMBitmapFactory", "decoder [%s] decodes done, ret:%d.", new Object[] { paramDecodeResultLogger.mDecoderTag, Integer.valueOf(paramDecodeResultLogger.mDecodeResultCode) });
        paramVarArgs = (int[])localObject;
        paramArrayOfByte = paramDecodeResultLogger;
        if (localObject != null)
        {
          paramArrayOfByte = (byte[])localObject;
          if (paramOptions != null)
          {
            paramVarArgs = (int[])localObject;
            paramArrayOfByte = (byte[])localObject;
            if (paramOptions.inScaled)
            {
              paramVarArgs = (int[])localObject;
              paramArrayOfByte = (byte[])localObject;
              if (!paramOptions.inJustDecodeBounds)
              {
                paramVarArgs = (int[])localObject;
                paramArrayOfByte = getScaledBitmap((Bitmap)localObject, paramOptions);
                if (paramArrayOfByte == localObject) {
                  break label387;
                }
                paramVarArgs = (int[])localObject;
                ((Bitmap)localObject).recycle();
                break label387;
              }
            }
          }
        }
      }
    }
    label387:
    for (;;)
    {
      paramVarArgs = paramArrayOfByte;
      setDensityFromOptions(paramArrayOfByte, paramOptions);
      paramVarArgs = paramArrayOfByte;
      paramArrayOfByte = paramDecodeResultLogger;
      break label166;
      break;
    }
  }
  
  private static Bitmap decodeByteArrayWithSystemDecoder(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    paramOptions = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions);
    if (paramDecodeResultLogger != null)
    {
      paramDecodeResultLogger.clear();
      if (paramOptions != null)
      {
        paramInt1 = 0;
        DecodeResultLogger.access$002(paramDecodeResultLogger, paramInt1);
        DecodeResultLogger.access$102(paramDecodeResultLogger, false);
      }
    }
    else
    {
      if (paramOptions == null) {
        break label72;
      }
    }
    label72:
    for (paramArrayOfByte = paramOptions.toString();; paramArrayOfByte = "null")
    {
      x.i("MicroMsg.MMBitmapFactory", "decode bytearray by system decoder done, res: %s", new Object[] { paramArrayOfByte });
      return paramOptions;
      paramInt1 = 1006;
      break;
    }
  }
  
  public static Bitmap decodeFile(String paramString)
  {
    return decodeFile(paramString, null, null, 1, new int[0]);
  }
  
  public static Bitmap decodeFile(String paramString, int paramInt)
  {
    return decodeFile(paramString, null, null, paramInt, new int[0]);
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    return decodeFile(paramString, paramOptions, null, 1, new int[0]);
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions, int paramInt)
  {
    return decodeFile(paramString, paramOptions, null, paramInt, new int[0]);
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    try
    {
      paramString = decodeStream(com.tencent.mm.vfs.d.openRead(paramString), null, paramOptions, paramDecodeResultLogger, paramInt, paramVarArgs);
      return paramString;
    }
    catch (FileNotFoundException paramString) {}
    return null;
  }
  
  public static Bitmap decodeFile(String paramString, DecodeResultLogger paramDecodeResultLogger)
  {
    return decodeFile(paramString, null, paramDecodeResultLogger, 1, new int[0]);
  }
  
  public static Bitmap decodeFile(String paramString, DecodeResultLogger paramDecodeResultLogger, int paramInt)
  {
    return decodeFile(paramString, null, paramDecodeResultLogger, paramInt, new int[0]);
  }
  
  public static Bitmap decodeFileDescriptor(FileDescriptor paramFileDescriptor, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    Object localObject2 = null;
    if (!checkIfHaveToUseMMDecoder(paramOptions)) {}
    for (;;)
    {
      try
      {
        Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, paramOptions);
        if (localBitmap == null) {
          break;
        }
        if (paramDecodeResultLogger != null)
        {
          paramDecodeResultLogger.clear();
          DecodeResultLogger.access$002(paramDecodeResultLogger, 0);
          DecodeResultLogger.access$102(paramDecodeResultLogger, false);
        }
        return localBitmap;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.MMBitmapFactory", localException, "", new Object[0]);
      }
      Object localObject1 = null;
    }
    x.d("MicroMsg.MMBitmapFactory", "decodeFileDescriptor, fallback");
    try
    {
      paramFileDescriptor = new FileInputStream(paramFileDescriptor);
      bi.d(paramOptions);
    }
    finally
    {
      try
      {
        paramOptions = decodeStream(paramFileDescriptor, null, paramOptions, paramDecodeResultLogger, 0, new int[0]);
        bi.d(paramFileDescriptor);
        return paramOptions;
      }
      finally
      {
        paramOptions = paramFileDescriptor;
        paramFileDescriptor = paramDecodeResultLogger;
      }
      paramFileDescriptor = finally;
      paramOptions = (BitmapFactory.Options)localObject2;
    }
    throw paramFileDescriptor;
  }
  
  /* Error */
  public static Bitmap decodeRegion(FileDescriptor paramFileDescriptor, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aload_2
    //   4: invokestatic 380	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIfHaveToUseMMDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   7: ifne +181 -> 188
    //   10: aload_0
    //   11: iconst_1
    //   12: invokestatic 400	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/FileDescriptor;Z)Landroid/graphics/BitmapRegionDecoder;
    //   15: astore 4
    //   17: aload 4
    //   19: astore 5
    //   21: aload 4
    //   23: aload_1
    //   24: aload_2
    //   25: invokevirtual 403	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   28: astore 6
    //   30: aload 6
    //   32: astore 5
    //   34: aload 4
    //   36: ifnull +12 -> 48
    //   39: aload 4
    //   41: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   44: aload 6
    //   46: astore 5
    //   48: aload 5
    //   50: ifnull +80 -> 130
    //   53: aload_3
    //   54: ifnull +19 -> 73
    //   57: aload_3
    //   58: invokevirtual 349	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:clear	()V
    //   61: aload_3
    //   62: iconst_0
    //   63: invokestatic 139	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$002	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)I
    //   66: pop
    //   67: aload_3
    //   68: iconst_0
    //   69: invokestatic 302	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$102	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;Z)Z
    //   72: pop
    //   73: aload 5
    //   75: areturn
    //   76: astore 6
    //   78: aconst_null
    //   79: astore 4
    //   81: aload 4
    //   83: astore 5
    //   85: ldc 64
    //   87: aload 6
    //   89: ldc 116
    //   91: iconst_0
    //   92: anewarray 4	java/lang/Object
    //   95: invokestatic 179	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: aload 4
    //   100: ifnull +88 -> 188
    //   103: aload 4
    //   105: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   108: aconst_null
    //   109: astore 5
    //   111: goto -63 -> 48
    //   114: astore_0
    //   115: aconst_null
    //   116: astore 5
    //   118: aload 5
    //   120: ifnull +8 -> 128
    //   123: aload 5
    //   125: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   128: aload_0
    //   129: athrow
    //   130: ldc 64
    //   132: ldc_w 406
    //   135: invokestatic 387	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: new 389	java/io/FileInputStream
    //   141: dup
    //   142: aload_0
    //   143: invokespecial 392	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   146: astore_0
    //   147: aload_0
    //   148: aload_1
    //   149: aload_2
    //   150: aload_3
    //   151: invokestatic 410	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegionFallback	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   154: astore_1
    //   155: aload_0
    //   156: invokestatic 173	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   159: aload_1
    //   160: areturn
    //   161: astore_0
    //   162: aload 7
    //   164: astore_1
    //   165: aload_1
    //   166: invokestatic 173	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   169: aload_0
    //   170: athrow
    //   171: astore_2
    //   172: aload_0
    //   173: astore_1
    //   174: aload_2
    //   175: astore_0
    //   176: goto -11 -> 165
    //   179: astore_0
    //   180: goto -62 -> 118
    //   183: astore 6
    //   185: goto -104 -> 81
    //   188: aconst_null
    //   189: astore 5
    //   191: goto -143 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	paramFileDescriptor	FileDescriptor
    //   0	194	1	paramRect	Rect
    //   0	194	2	paramOptions	BitmapFactory.Options
    //   0	194	3	paramDecodeResultLogger	DecodeResultLogger
    //   15	89	4	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   19	171	5	localObject1	Object
    //   28	17	6	localBitmap	Bitmap
    //   76	12	6	localException1	Exception
    //   183	1	6	localException2	Exception
    //   1	162	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   10	17	76	java/lang/Exception
    //   10	17	114	finally
    //   138	147	161	finally
    //   147	155	171	finally
    //   21	30	179	finally
    //   85	98	179	finally
    //   21	30	183	java/lang/Exception
  }
  
  /* Error */
  public static Bitmap decodeRegion(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 380	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIfHaveToUseMMDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   4: ifne +144 -> 148
    //   7: aload_0
    //   8: iconst_1
    //   9: invokestatic 413	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   12: astore 5
    //   14: aload 5
    //   16: astore 4
    //   18: aload 5
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual 403	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   25: astore 6
    //   27: aload 5
    //   29: ifnull +125 -> 154
    //   32: aload 5
    //   34: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   37: aload 6
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull +80 -> 123
    //   46: aload_3
    //   47: ifnull +19 -> 66
    //   50: aload_3
    //   51: invokevirtual 349	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:clear	()V
    //   54: aload_3
    //   55: iconst_0
    //   56: invokestatic 139	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$002	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)I
    //   59: pop
    //   60: aload_3
    //   61: iconst_0
    //   62: invokestatic 302	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$102	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;Z)Z
    //   65: pop
    //   66: aload 4
    //   68: areturn
    //   69: astore 6
    //   71: aconst_null
    //   72: astore 5
    //   74: aload 5
    //   76: astore 4
    //   78: ldc 64
    //   80: aload 6
    //   82: ldc 116
    //   84: iconst_0
    //   85: anewarray 4	java/lang/Object
    //   88: invokestatic 179	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload 5
    //   93: ifnull +55 -> 148
    //   96: aload 5
    //   98: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   101: aconst_null
    //   102: astore 4
    //   104: goto -63 -> 41
    //   107: astore_0
    //   108: aconst_null
    //   109: astore 4
    //   111: aload 4
    //   113: ifnull +8 -> 121
    //   116: aload 4
    //   118: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   121: aload_0
    //   122: athrow
    //   123: ldc 64
    //   125: ldc_w 415
    //   128: invokestatic 387	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: aload_0
    //   132: aload_1
    //   133: aload_2
    //   134: aload_3
    //   135: invokestatic 410	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegionFallback	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   138: areturn
    //   139: astore_0
    //   140: goto -29 -> 111
    //   143: astore 6
    //   145: goto -71 -> 74
    //   148: aconst_null
    //   149: astore 4
    //   151: goto -110 -> 41
    //   154: aload 6
    //   156: astore 4
    //   158: goto -117 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	paramInputStream	InputStream
    //   0	161	1	paramRect	Rect
    //   0	161	2	paramOptions	BitmapFactory.Options
    //   0	161	3	paramDecodeResultLogger	DecodeResultLogger
    //   16	141	4	localObject	Object
    //   12	85	5	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   25	13	6	localBitmap	Bitmap
    //   69	12	6	localException1	Exception
    //   143	12	6	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   7	14	69	java/lang/Exception
    //   7	14	107	finally
    //   18	27	139	finally
    //   78	91	139	finally
    //   18	27	143	java/lang/Exception
  }
  
  /* Error */
  public static Bitmap decodeRegion(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aload 4
    //   2: invokestatic 380	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIfHaveToUseMMDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   5: ifne +155 -> 160
    //   8: aload_0
    //   9: iload_1
    //   10: iload_2
    //   11: iconst_1
    //   12: invokestatic 419	android/graphics/BitmapRegionDecoder:newInstance	([BIIZ)Landroid/graphics/BitmapRegionDecoder;
    //   15: astore 7
    //   17: aload 7
    //   19: astore 6
    //   21: aload 7
    //   23: aload_3
    //   24: aload 4
    //   26: invokevirtual 403	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   29: astore 8
    //   31: aload 7
    //   33: ifnull +133 -> 166
    //   36: aload 7
    //   38: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   41: aload 8
    //   43: astore 6
    //   45: aload 6
    //   47: ifnull +84 -> 131
    //   50: aload 5
    //   52: ifnull +22 -> 74
    //   55: aload 5
    //   57: invokevirtual 349	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:clear	()V
    //   60: aload 5
    //   62: iconst_0
    //   63: invokestatic 139	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$002	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)I
    //   66: pop
    //   67: aload 5
    //   69: iconst_0
    //   70: invokestatic 302	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$102	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;Z)Z
    //   73: pop
    //   74: aload 6
    //   76: areturn
    //   77: astore 8
    //   79: aconst_null
    //   80: astore 7
    //   82: aload 7
    //   84: astore 6
    //   86: ldc 64
    //   88: aload 8
    //   90: ldc 116
    //   92: iconst_0
    //   93: anewarray 4	java/lang/Object
    //   96: invokestatic 179	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload 7
    //   101: ifnull +59 -> 160
    //   104: aload 7
    //   106: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   109: aconst_null
    //   110: astore 6
    //   112: goto -67 -> 45
    //   115: astore_0
    //   116: aconst_null
    //   117: astore 6
    //   119: aload 6
    //   121: ifnull +8 -> 129
    //   124: aload 6
    //   126: invokevirtual 404	android/graphics/BitmapRegionDecoder:recycle	()V
    //   129: aload_0
    //   130: athrow
    //   131: ldc 64
    //   133: ldc_w 421
    //   136: invokestatic 387	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: aload_0
    //   140: iload_1
    //   141: iload_2
    //   142: aload_3
    //   143: aload 4
    //   145: aload 5
    //   147: invokestatic 423	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegionFallback	([BIILandroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   150: areturn
    //   151: astore_0
    //   152: goto -33 -> 119
    //   155: astore 8
    //   157: goto -75 -> 82
    //   160: aconst_null
    //   161: astore 6
    //   163: goto -118 -> 45
    //   166: aload 8
    //   168: astore 6
    //   170: goto -125 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	paramArrayOfByte	byte[]
    //   0	173	1	paramInt1	int
    //   0	173	2	paramInt2	int
    //   0	173	3	paramRect	Rect
    //   0	173	4	paramOptions	BitmapFactory.Options
    //   0	173	5	paramDecodeResultLogger	DecodeResultLogger
    //   19	150	6	localObject	Object
    //   15	90	7	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   29	13	8	localBitmap	Bitmap
    //   77	12	8	localException1	Exception
    //   155	12	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   8	17	77	java/lang/Exception
    //   8	17	115	finally
    //   21	31	151	finally
    //   86	99	151	finally
    //   21	31	155	java/lang/Exception
  }
  
  private static Bitmap decodeRegionFallback(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    Object localObject = null;
    paramOptions = decodeStream(paramInputStream, null, paramOptions, paramDecodeResultLogger, 0, new int[0]);
    paramInputStream = (InputStream)localObject;
    if (paramOptions != null)
    {
      paramRect = Bitmap.createBitmap(paramOptions, paramRect.left, paramRect.top, paramRect.right - paramRect.left, paramRect.bottom - paramRect.top);
      paramInputStream = paramRect;
      if (paramRect != paramOptions)
      {
        paramOptions.recycle();
        paramInputStream = paramRect;
      }
    }
    return paramInputStream;
  }
  
  private static Bitmap decodeRegionFallback(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, 0, new int[0]);
    if (paramArrayOfByte != null)
    {
      paramRect = Bitmap.createBitmap(paramArrayOfByte, paramRect.left, paramRect.top, paramRect.right - paramRect.left, paramRect.bottom - paramRect.top);
      if (paramRect != paramArrayOfByte) {
        paramArrayOfByte.recycle();
      }
      return paramRect;
    }
    return null;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    return decodeStream(paramInputStream, null, null, null, 1, new int[0]);
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, int paramInt)
  {
    return decodeStream(paramInputStream, null, null, null, paramInt, new int[0]);
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    return decodeStream(paramInputStream, paramRect, paramOptions, null, 1, new int[0]);
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, int paramInt)
  {
    return decodeStream(paramInputStream, paramRect, paramOptions, null, paramInt, new int[0]);
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    boolean bool = HardCoderJNI.hcDecodePicEnable;
    int j = HardCoderJNI.hcDecodePicDelay;
    int k = HardCoderJNI.hcDecodePicCPU;
    int m = HardCoderJNI.hcDecodePicIO;
    if (HardCoderJNI.hcDecodePicThr) {}
    for (int i = Process.myTid();; i = 0)
    {
      i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDecodePicTimeout, 601, HardCoderJNI.hcDecodePicAction, "MicroMsg.MMBitmapFactory");
      long l2 = System.currentTimeMillis();
      try
      {
        j = paramInputStream.available();
        l1 = j;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          long l1 = -1L;
        }
      }
      paramInputStream = decodeStreamInternal(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger, paramInt, paramVarArgs);
      x.i("MicroMsg.MMBitmapFactory", "decode done, size:%d, cost:%d ms", new Object[] { Long.valueOf(l1), Long.valueOf(System.currentTimeMillis() - l2) });
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDecodePicEnable, i);
      return paramInputStream;
    }
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger)
  {
    return decodeStream(paramInputStream, null, null, paramDecodeResultLogger, 1, new int[0]);
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    return decodeStream(paramInputStream, null, null, paramDecodeResultLogger, paramInt, paramVarArgs);
  }
  
  private static Bitmap decodeStreamInternal(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    checkIsInit();
    boolean bool = DynamicConfigStorage.getValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false);
    if ((bool) && (!(paramInputStream instanceof AssetManager.AssetInputStream)))
    {
      switch (paramInt)
      {
      default: 
        x.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
        return decodeStreamWithSystemDecoder(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger);
      }
      return decodeStreamWithMMDecoderIfPossible(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger, paramVarArgs);
    }
    x.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
    return decodeStreamWithSystemDecoder(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger);
  }
  
  private static Bitmap decodeStreamWithMMDecoderIfPossible(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs)
  {
    Object localObject1;
    if (paramOptions != null)
    {
      localObject1 = paramOptions.inTempStorage;
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new byte[' '];
      }
      if (!paramInputStream.markSupported())
      {
        if ((paramInputStream instanceof FileInputStream)) {
          localObject1 = new i((FileInputStream)paramInputStream);
        }
        for (;;)
        {
          try
          {
            label53:
            ((InputStream)localObject1).mark(8388608);
            if (paramDecodeResultLogger != null) {
              continue;
            }
            paramInputStream = new DecodeResultLogger();
            paramDecodeResultLogger = paramInputStream;
          }
          catch (IOException paramRect)
          {
            label215:
            paramInputStream = null;
            x.printErrStackTrace("MicroMsg.MMBitmapFactory", paramRect, "An exception was thrown when decode image.", new Object[0]);
            DecodeResultLogger.access$002(paramDecodeResultLogger, 1005);
            continue;
            continue;
          }
          try
          {
            paramVarArgs = nativeDecodeStream((InputStream)localObject1, (byte[])localObject2, paramRect, paramOptions, paramDecodeResultLogger, paramVarArgs);
            paramInputStream = paramVarArgs;
          }
          catch (IOException paramRect)
          {
            paramInputStream = null;
            continue;
          }
          try
          {
            if (paramDecodeResultLogger.mDecodeResultCode != 0)
            {
              paramInputStream = paramVarArgs;
              if (paramDecodeResultLogger.mDecodeResultCode < 2000)
              {
                paramInputStream = paramVarArgs;
                x.i("MicroMsg.MMBitmapFactory", "mmimgdec decoder decodes failed, try system BitmapFactory.");
                paramInputStream = paramVarArgs;
                DecodeResultLogger.access$102(paramDecodeResultLogger, false);
                paramInputStream = paramVarArgs;
                ((InputStream)localObject1).reset();
                paramInputStream = paramVarArgs;
                ((InputStream)localObject1).mark(8388608);
                paramInputStream = paramVarArgs;
                paramRect = BitmapFactory.decodeStream((InputStream)localObject1, paramRect, paramOptions);
                if (paramRect == null)
                {
                  if (paramOptions != null)
                  {
                    paramInputStream = paramRect;
                    if (paramOptions.inJustDecodeBounds)
                    {
                      paramInputStream = paramRect;
                      if (paramOptions.outWidth >= 0)
                      {
                        paramInputStream = paramRect;
                        if (paramOptions.outHeight < 0) {}
                      }
                    }
                  }
                }
                else
                {
                  paramInputStream = paramRect;
                  x.i("MicroMsg.MMBitmapFactory", "System decoder decodes success.");
                  paramInputStream = paramRect;
                  DecodeResultLogger.access$002(paramDecodeResultLogger, 0);
                  paramInputStream = paramRect;
                }
              }
            }
          }
          catch (IOException paramRect)
          {
            continue;
          }
          try
          {
            ((InputStream)localObject1).reset();
            ((InputStream)localObject1).mark(8388608);
            x.i("MicroMsg.MMBitmapFactory", paramDecodeResultLogger.toLogString());
            return paramInputStream;
          }
          catch (IOException paramRect)
          {
            continue;
          }
          localObject1 = new BufferedInputStream(paramInputStream);
          continue;
          paramInputStream = paramRect;
          x.w("MicroMsg.MMBitmapFactory", "System decoder decodes failed.");
          paramInputStream = paramRect;
          DecodeResultLogger.access$002(paramDecodeResultLogger, 1006);
          paramInputStream = paramRect;
          continue;
          paramInputStream = paramVarArgs;
          x.i("MicroMsg.MMBitmapFactory", "decoder [%s] decodes done, ret:%d.", new Object[] { paramDecodeResultLogger.mDecoderTag, Integer.valueOf(paramDecodeResultLogger.mDecodeResultCode) });
          paramRect = paramVarArgs;
          if (paramVarArgs != null)
          {
            paramRect = paramVarArgs;
            if (paramOptions != null)
            {
              paramRect = paramVarArgs;
              paramInputStream = paramVarArgs;
              if (paramOptions.inScaled)
              {
                paramRect = paramVarArgs;
                paramInputStream = paramVarArgs;
                if (!paramOptions.inJustDecodeBounds)
                {
                  paramInputStream = paramVarArgs;
                  paramRect = getScaledBitmap(paramVarArgs, paramOptions);
                  if (paramRect == paramVarArgs) {
                    break label444;
                  }
                  paramInputStream = paramVarArgs;
                  paramVarArgs.recycle();
                  break label444;
                }
              }
            }
          }
        }
      }
    }
    label444:
    for (;;)
    {
      paramInputStream = paramRect;
      setDensityFromOptions(paramRect, paramOptions);
      paramInputStream = paramRect;
      break label215;
      localObject1 = paramInputStream;
      break label53;
      localObject1 = null;
      break;
    }
  }
  
  private static Bitmap decodeStreamWithSystemDecoder(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    int i = 1006;
    paramRect = BitmapFactory.decodeStream(paramInputStream, paramRect, paramOptions);
    if (paramDecodeResultLogger != null)
    {
      paramDecodeResultLogger.clear();
      if ((paramOptions == null) || (!paramOptions.inJustDecodeBounds))
      {
        if (paramRect != null) {
          i = 0;
        }
        DecodeResultLogger.access$002(paramDecodeResultLogger, i);
        DecodeResultLogger.access$102(paramDecodeResultLogger, false);
      }
    }
    else
    {
      if (paramRect == null) {
        break label113;
      }
    }
    label113:
    for (paramInputStream = paramRect.toString();; paramInputStream = "null")
    {
      x.i("MicroMsg.MMBitmapFactory", "decode stream by system decoder done, res: %s", new Object[] { paramInputStream });
      return paramRect;
      int j = i;
      if (paramOptions.outWidth >= 0)
      {
        j = i;
        if (paramOptions.outHeight >= 0) {
          j = 0;
        }
      }
      DecodeResultLogger.access$002(paramDecodeResultLogger, j);
      break;
    }
  }
  
  private static Bitmap getScaledBitmap(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    int i = paramOptions.inDensity;
    int j = paramOptions.inTargetDensity;
    int k = paramOptions.inScreenDensity;
    if ((i != 0) && (j != 0) && (i != k)) {}
    for (float f = j / i;; f = 1.0F)
    {
      if (f != 1.0F) {}
      for (i = 1;; i = 0)
      {
        paramOptions = paramBitmap;
        if (i != 0) {
          paramOptions = Bitmap.createScaledBitmap(paramBitmap, (int)(paramBitmap.getWidth() * f + 0.5F), (int)(f * paramBitmap.getHeight() + 0.5F), true);
        }
        return paramOptions;
      }
    }
  }
  
  public static boolean init()
  {
    if (n.zq()) {
      com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v7a.so");
    }
    try
    {
      mIsInit = nativeInit(new String[] { new File(ad.getContext().getDir("lib", 0), "libvoipCodec_v7a.so").getAbsolutePath() });
      if (!mIsInit)
      {
        DynamicConfigStorage.setValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false);
        x.w("MicroMsg.MMBitmapFactory", "MMBitmapFactory initialize failed, force use system BitmapFactory instead.");
      }
      return mIsInit;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.MMBitmapFactory", localThrowable, "", new Object[0]);
        if (!com.tencent.mm.compatible.util.d.fS(20)) {
          break;
        }
        mIsInit = nativeInit(new String[] { new File(ad.getContext().getDir("lib", 0), "libvoipCodec_v7a.so").getAbsolutePath() });
      }
      throw localThrowable;
    }
  }
  
  private static native int nativeCheckIsImageLegal(InputStream paramInputStream, byte[] paramArrayOfByte, DecodeResultLogger paramDecodeResultLogger);
  
  private static native Bitmap nativeDecodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs);
  
  private static native Bitmap nativeDecodeStream(InputStream paramInputStream, byte[] paramArrayOfByte, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs);
  
  private static native boolean nativeInit(String... paramVarArgs);
  
  private static native int nativePinBitmap(Bitmap paramBitmap);
  
  private static native boolean nativeSwitchDecoder(int paramInt, boolean paramBoolean);
  
  private static native int nativeUnPinBitmap(Bitmap paramBitmap);
  
  public static Bitmap pinBitmap(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (nativePinBitmap(paramBitmap) < 0)) {
      x.e("MicroMsg.MMBitmapFactory", "pinBitmap failed");
    }
    return paramBitmap;
  }
  
  private static void setDensityFromOptions(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    int i = 1;
    if ((paramBitmap == null) || (paramOptions == null)) {}
    do
    {
      for (;;)
      {
        return;
        int k = paramOptions.inDensity;
        if (k == 0) {
          break;
        }
        paramBitmap.setDensity(k);
        int j = paramOptions.inTargetDensity;
        if ((j != 0) && (k != j) && (k != paramOptions.inScreenDensity))
        {
          byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
          if ((arrayOfByte != null) && (NinePatch.isNinePatchChunk(arrayOfByte))) {}
          while ((paramOptions.inScaled) || (i != 0))
          {
            paramBitmap.setDensity(j);
            return;
            i = 0;
          }
        }
      }
    } while (paramOptions.inBitmap == null);
    try
    {
      if (mMthGetDefaultDensity == null)
      {
        paramOptions = Bitmap.class.getDeclaredMethod("getDefaultDensity", null);
        mMthGetDefaultDensity = paramOptions;
        paramOptions.setAccessible(true);
      }
      paramBitmap.setDensity(((Integer)mMthGetDefaultDensity.invoke(null, new Object[0])).intValue());
      return;
    }
    catch (Exception paramOptions)
    {
      paramBitmap.setDensity(160);
    }
  }
  
  public static void setUseMMBitmapFactory(boolean paramBoolean)
  {
    if (mIsInit)
    {
      DynamicConfigStorage.setValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, paramBoolean);
      if (!paramBoolean) {
        x.i("MicroMsg.MMBitmapFactory", "MMBitmapFactory is switched off, use system BitmapFactory directly.");
      }
    }
  }
  
  public static boolean switchDecoder(int paramInt, boolean paramBoolean)
  {
    return nativeSwitchDecoder(paramInt, paramBoolean);
  }
  
  public static Bitmap unPinBitmap(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (nativeUnPinBitmap(paramBitmap) < 0)) {
      x.e("MicroMsg.MMBitmapFactory", "unpinBitmap failed");
    }
    return paramBitmap;
  }
  
  public static class DecodeResultLogger
  {
    private int mDecodeResultCode;
    private String mDecoderTag = null;
    private boolean mIsDecodeByMMDecoder;
    
    public DecodeResultLogger()
    {
      clear();
    }
    
    private void fillerForNative(int paramInt, boolean paramBoolean, String paramString)
    {
      this.mDecodeResultCode = paramInt;
      this.mIsDecodeByMMDecoder = paramBoolean;
      String str;
      if (paramString != null)
      {
        str = paramString;
        if (paramString.length() != 0) {}
      }
      else
      {
        str = "System";
      }
      this.mDecoderTag = str;
    }
    
    public void clear()
    {
      this.mDecodeResultCode = 0;
      this.mIsDecodeByMMDecoder = false;
      this.mDecoderTag = "System";
    }
    
    public int getDecodeResult()
    {
      return this.mDecodeResultCode;
    }
    
    public String getDecoderTag()
    {
      return this.mDecoderTag;
    }
    
    public boolean isDecodeByMMDecoder()
    {
      return this.mIsDecodeByMMDecoder;
    }
    
    public void setDecodeResult(int paramInt)
    {
      this.mDecodeResultCode = paramInt;
    }
    
    public String toLogString()
    {
      return this.mDecodeResultCode + "," + this.mIsDecodeByMMDecoder + "," + this.mDecoderTag + "," + "-";
    }
    
    public String toString()
    {
      return "{" + this.mDecodeResultCode + "," + this.mIsDecodeByMMDecoder + "," + this.mDecoderTag + "}";
    }
  }
  
  private static class DynamicConfigStorage
  {
    public static String PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY = "pref_key_is_enable_MMBitmapFactory";
    private static final String PREF_NAME = "pref_MMBitmapFactory_dyncfg";
    private static SharedPreferences mPref = an.m(ad.getContext(), "pref_MMBitmapFactory_dyncfg", 4);
    
    public static boolean getValue(String paramString, boolean paramBoolean)
    {
      
      if (mPref == null)
      {
        x.w("MicroMsg.MMBitmapFactory", "SharedPreferences in DynamicConfigStorage initialize failed.");
        return paramBoolean;
      }
      paramBoolean = mPref.getBoolean(paramString, paramBoolean);
      x.d("MicroMsg.MMBitmapFactory", "DynamicConfigStorage, getValue:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      return paramBoolean;
    }
    
    private static void reload()
    {
      mPref = an.m(ad.getContext(), "pref_MMBitmapFactory_dyncfg", 4);
    }
    
    public static void setValue(String paramString, boolean paramBoolean)
    {
      if (mPref == null)
      {
        x.w("MicroMsg.MMBitmapFactory", "SharedPreferences in DynamicConfigStorage initialize failed.");
        return;
      }
      SharedPreferences.Editor localEditor = mPref.edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.commit();
    }
  }
  
  public static class HEVCKVStatHelper
  {
    private static final String KVSTAT_STRING_SEPERATOR = ",";
    public static final int SCENE_SNS = 0;
    private static final long STAT_INTERVAL = 60000L;
    private static long mLastStatTick = 0L;
    
    public static String getKVStatString(Object paramObject, int paramInt, long paramLong, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      long l2 = -1L;
      long l1;
      if ((paramObject instanceof File))
      {
        paramObject = (File)paramObject;
        l1 = l2;
        if (((File)paramObject).exists())
        {
          l1 = l2;
          if (((File)paramObject).isFile()) {
            l1 = ((File)paramObject).length();
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(paramInt).append(",").append(paramDecodeResultLogger.mDecodeResultCode).append(",").append(l1).append(",").append(paramLong).append(",").append(bi.oV(paramOptions.outMimeType));
        return localStringBuilder.toString();
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          l1 = l2;
          if (((b)paramObject).exists())
          {
            l1 = l2;
            if (((b)paramObject).isFile()) {
              l1 = ((b)paramObject).length();
            }
          }
        }
        else if ((paramObject instanceof String))
        {
          paramObject = (String)paramObject;
          l1 = l2;
          if (com.tencent.mm.vfs.d.cn((String)paramObject)) {
            l1 = com.tencent.mm.vfs.d.abQ((String)paramObject);
          }
        }
        else
        {
          l1 = l2;
          if ((paramObject instanceof byte[])) {
            l1 = ((byte[])paramObject).length;
          }
        }
      }
    }
    
    public static boolean isTimeToStat()
    {
      long l = bi.VG();
      if (l - mLastStatTick > 60000L)
      {
        mLastStatTick = l;
        return true;
      }
      return false;
    }
  }
  
  public static class KVStatHelper
  {
    private static final String KVSTAT_STRING_SEPERATOR = ",";
    public static final int MMBMPFACTORY_SCENE_ADDTOFAV = 5;
    public static final int MMBMPFACTORY_SCENE_APPMSG_DECODE = 9;
    public static final int MMBMPFACTORY_SCENE_APPMSG_TRANS = 6;
    public static final int MMBMPFACTORY_SCENE_GALLERY_BROWSE = 1;
    public static final int MMBMPFACTORY_SCENE_GET_MSGIMG = 2;
    public static final int MMBMPFACTORY_SCENE_IMGMSG_TRANS = 7;
    public static final int MMBMPFACTORY_SCENE_NONE = 0;
    public static final int MMBMPFACTORY_SCENE_OTHERS = 8;
    public static final int MMBMPFACTORY_SCENE_SHAREIMG = 3;
    public static final int MMBMPFACTORY_SCENE_SHARE_TO_TIMELINE = 4;
    public static final int MMBMPFACTORY_SCENE_SNS_IMGRECV = 10;
    
    /* Error */
    public static String getKVStatString(Object paramObject, int paramInt, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 11
      //   3: aconst_null
      //   4: astore 10
      //   6: new 47	java/lang/StringBuilder
      //   9: dup
      //   10: sipush 128
      //   13: invokespecial 50	java/lang/StringBuilder:<init>	(I)V
      //   16: astore 12
      //   18: ldc 52
      //   20: astore 8
      //   22: ldc2_w 53
      //   25: lstore 5
      //   27: aload_0
      //   28: instanceof 56
      //   31: ifeq +80 -> 111
      //   34: aload_0
      //   35: checkcast 56	java/io/File
      //   38: astore_0
      //   39: aload_0
      //   40: invokevirtual 60	java/io/File:exists	()Z
      //   43: ifeq +451 -> 494
      //   46: aload_0
      //   47: invokevirtual 63	java/io/File:isFile	()Z
      //   50: ifeq +444 -> 494
      //   53: aload_0
      //   54: invokestatic 69	com/tencent/mm/a/g:m	(Ljava/io/File;)Ljava/lang/String;
      //   57: invokestatic 75	com/tencent/mm/sdk/platformtools/bi:oV	(Ljava/lang/String;)Ljava/lang/String;
      //   60: astore 7
      //   62: aload_0
      //   63: invokevirtual 79	java/io/File:length	()J
      //   66: lstore_3
      //   67: aload 12
      //   69: iload_1
      //   70: invokevirtual 83	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   73: ldc 11
      //   75: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   78: aload_2
      //   79: invokestatic 92	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:access$000	(Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)I
      //   82: invokevirtual 83	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   85: ldc 11
      //   87: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   90: lload_3
      //   91: invokevirtual 95	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   94: ldc 11
      //   96: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   99: aload 7
      //   101: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   104: pop
      //   105: aload 12
      //   107: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   110: areturn
      //   111: aload_0
      //   112: instanceof 101
      //   115: ifeq +146 -> 261
      //   118: aload_0
      //   119: checkcast 101	com/tencent/mm/vfs/b
      //   122: astore 10
      //   124: lload 5
      //   126: lstore_3
      //   127: aload 8
      //   129: astore 7
      //   131: aload 10
      //   133: invokevirtual 102	com/tencent/mm/vfs/b:exists	()Z
      //   136: ifeq -69 -> 67
      //   139: aload 10
      //   141: getfield 106	com/tencent/mm/vfs/b:aMJ	Landroid/net/Uri;
      //   144: invokestatic 112	com/tencent/mm/vfs/d:o	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   147: astore_0
      //   148: aload_0
      //   149: sipush 4096
      //   152: invokestatic 116	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
      //   155: invokestatic 75	com/tencent/mm/sdk/platformtools/bi:oV	(Ljava/lang/String;)Ljava/lang/String;
      //   158: astore 9
      //   160: aload 9
      //   162: astore 8
      //   164: aload 10
      //   166: invokevirtual 117	com/tencent/mm/vfs/b:length	()J
      //   169: lstore_3
      //   170: lload_3
      //   171: lstore 5
      //   173: lload 5
      //   175: lstore_3
      //   176: aload 9
      //   178: astore 7
      //   180: aload_0
      //   181: ifnull -114 -> 67
      //   184: aload_0
      //   185: invokevirtual 122	java/io/InputStream:close	()V
      //   188: lload 5
      //   190: lstore_3
      //   191: aload 9
      //   193: astore 7
      //   195: goto -128 -> 67
      //   198: astore_0
      //   199: lload 5
      //   201: lstore_3
      //   202: aload 9
      //   204: astore 7
      //   206: goto -139 -> 67
      //   209: astore_0
      //   210: aconst_null
      //   211: astore_0
      //   212: lload 5
      //   214: lstore_3
      //   215: aload 8
      //   217: astore 7
      //   219: aload_0
      //   220: ifnull -153 -> 67
      //   223: aload_0
      //   224: invokevirtual 122	java/io/InputStream:close	()V
      //   227: lload 5
      //   229: lstore_3
      //   230: aload 8
      //   232: astore 7
      //   234: goto -167 -> 67
      //   237: astore_0
      //   238: lload 5
      //   240: lstore_3
      //   241: aload 8
      //   243: astore 7
      //   245: goto -178 -> 67
      //   248: astore_0
      //   249: aconst_null
      //   250: astore_2
      //   251: aload_2
      //   252: ifnull +7 -> 259
      //   255: aload_2
      //   256: invokevirtual 122	java/io/InputStream:close	()V
      //   259: aload_0
      //   260: athrow
      //   261: aload_0
      //   262: instanceof 124
      //   265: ifeq +169 -> 434
      //   268: aload_0
      //   269: checkcast 124	java/lang/String
      //   272: astore 13
      //   274: lload 5
      //   276: lstore_3
      //   277: aload 8
      //   279: astore 7
      //   281: aload 13
      //   283: invokestatic 128	com/tencent/mm/vfs/d:cn	(Ljava/lang/String;)Z
      //   286: ifeq -219 -> 67
      //   289: aload 8
      //   291: astore 9
      //   293: aload 11
      //   295: astore 7
      //   297: aload_0
      //   298: checkcast 124	java/lang/String
      //   301: invokestatic 132	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
      //   304: astore_0
      //   305: aload_0
      //   306: astore 10
      //   308: aload 8
      //   310: astore 9
      //   312: aload_0
      //   313: astore 7
      //   315: aload_0
      //   316: sipush 4096
      //   319: invokestatic 116	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
      //   322: invokestatic 75	com/tencent/mm/sdk/platformtools/bi:oV	(Ljava/lang/String;)Ljava/lang/String;
      //   325: astore 8
      //   327: aload_0
      //   328: astore 10
      //   330: aload 8
      //   332: astore 9
      //   334: aload_0
      //   335: astore 7
      //   337: aload 13
      //   339: invokestatic 136	com/tencent/mm/vfs/d:abQ	(Ljava/lang/String;)J
      //   342: lstore_3
      //   343: lload_3
      //   344: lstore 5
      //   346: lload 5
      //   348: lstore_3
      //   349: aload 8
      //   351: astore 7
      //   353: aload_0
      //   354: ifnull -287 -> 67
      //   357: aload_0
      //   358: invokevirtual 122	java/io/InputStream:close	()V
      //   361: lload 5
      //   363: lstore_3
      //   364: aload 8
      //   366: astore 7
      //   368: goto -301 -> 67
      //   371: astore_0
      //   372: lload 5
      //   374: lstore_3
      //   375: aload 8
      //   377: astore 7
      //   379: goto -312 -> 67
      //   382: astore_0
      //   383: lload 5
      //   385: lstore_3
      //   386: aload 9
      //   388: astore 7
      //   390: aload 10
      //   392: ifnull -325 -> 67
      //   395: aload 10
      //   397: invokevirtual 122	java/io/InputStream:close	()V
      //   400: lload 5
      //   402: lstore_3
      //   403: aload 9
      //   405: astore 7
      //   407: goto -340 -> 67
      //   410: astore_0
      //   411: lload 5
      //   413: lstore_3
      //   414: aload 9
      //   416: astore 7
      //   418: goto -351 -> 67
      //   421: astore_0
      //   422: aload 7
      //   424: ifnull +8 -> 432
      //   427: aload 7
      //   429: invokevirtual 122	java/io/InputStream:close	()V
      //   432: aload_0
      //   433: athrow
      //   434: lload 5
      //   436: lstore_3
      //   437: aload 8
      //   439: astore 7
      //   441: aload_0
      //   442: instanceof 138
      //   445: ifeq -378 -> 67
      //   448: aload_0
      //   449: checkcast 138	[B
      //   452: checkcast 138	[B
      //   455: astore_0
      //   456: aload_0
      //   457: invokestatic 142	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
      //   460: astore 7
      //   462: aload_0
      //   463: arraylength
      //   464: i2l
      //   465: lstore_3
      //   466: goto -399 -> 67
      //   469: astore_2
      //   470: goto -211 -> 259
      //   473: astore_2
      //   474: goto -42 -> 432
      //   477: astore_2
      //   478: aload_0
      //   479: astore 7
      //   481: aload_2
      //   482: astore_0
      //   483: aload 7
      //   485: astore_2
      //   486: goto -235 -> 251
      //   489: astore 7
      //   491: goto -279 -> 212
      //   494: ldc2_w 53
      //   497: lstore_3
      //   498: aload 8
      //   500: astore 7
      //   502: goto -435 -> 67
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	505	0	paramObject	Object
      //   0	505	1	paramInt	int
      //   0	505	2	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
      //   66	432	3	l1	long
      //   25	410	5	l2	long
      //   60	424	7	localObject1	Object
      //   489	1	7	localFileNotFoundException	FileNotFoundException
      //   500	1	7	localObject2	Object
      //   20	479	8	localObject3	Object
      //   158	257	9	localObject4	Object
      //   4	392	10	localObject5	Object
      //   1	293	11	localObject6	Object
      //   16	90	12	localStringBuilder	StringBuilder
      //   272	66	13	str	String
      // Exception table:
      //   from	to	target	type
      //   184	188	198	java/lang/Exception
      //   139	148	209	java/io/FileNotFoundException
      //   223	227	237	java/lang/Exception
      //   139	148	248	finally
      //   357	361	371	java/lang/Exception
      //   297	305	382	java/io/FileNotFoundException
      //   315	327	382	java/io/FileNotFoundException
      //   337	343	382	java/io/FileNotFoundException
      //   395	400	410	java/lang/Exception
      //   297	305	421	finally
      //   315	327	421	finally
      //   337	343	421	finally
      //   255	259	469	java/lang/Exception
      //   427	432	473	java/lang/Exception
      //   148	160	477	finally
      //   164	170	477	finally
      //   148	160	489	java/io/FileNotFoundException
      //   164	170	489	java/io/FileNotFoundException
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/MMBitmapFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */