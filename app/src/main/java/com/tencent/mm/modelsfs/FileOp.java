package com.tencent.mm.modelsfs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public final class FileOp
{
  private static TreeMap<String, SFSContextRec> eeA = new TreeMap();
  private static File eeB;
  private static String eeC = "";
  private static final EnumSet<g.a> eeD = EnumSet.of(g.a.eeN, g.a.eeO);
  private static ReentrantReadWriteLock eez = new ReentrantReadWriteLock();
  
  public static List<SFSContext.FileEntry> H(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return Collections.emptyList();
    }
    SFSContextRec localSFSContextRec = mF(paramString);
    Object localObject4;
    Object localObject3;
    Object localObject2;
    if (localSFSContextRec != null)
    {
      Object localObject1 = paramString.substring(localSFSContextRec.eeG.length());
      paramString = (String)localObject1;
      if (!((String)localObject1).endsWith("/")) {
        paramString = (String)localObject1 + "/";
      }
      try
      {
        localObject1 = localSFSContextRec.eeK.mT(paramString);
        localObject4 = new ArrayList();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (SFSContext.FileEntry)((Iterator)localObject1).next();
          if (((SFSContext.FileEntry)localObject3).name.substring(paramString.length()).indexOf('/') == -1) {
            ((List)localObject4).add(localObject3);
          }
        }
        if (localSFSContextRec == null) {
          break label221;
        }
      }
      catch (IOException localIOException)
      {
        x.printErrStackTrace("MicroMsg.FileOp", localIOException, "listFiles failed with SFS: " + paramString, new Object[0]);
        localObject2 = new ArrayList();
        localObject3 = paramString;
      }
      if ((localSFSContextRec.eeH != null) || (localSFSContextRec.eeI))
      {
        label221:
        paramString = new ArrayDeque();
        paramString.add(new File((String)localObject3));
      }
    }
    else
    {
      label266:
      do
      {
        localObject4 = ((File)paramString.pop()).listFiles();
        if (localObject4 != null)
        {
          int j = localObject4.length;
          int i = 0;
          if (i < j)
          {
            localSFSContextRec = localObject4[i];
            Object localObject5;
            if (localSFSContextRec.isFile())
            {
              localObject5 = new SFSContext.FileEntry();
              ((SFSContext.FileEntry)localObject5).name = localSFSContextRec.getAbsolutePath();
              if (paramBoolean)
              {
                ((SFSContext.FileEntry)localObject5).size = localSFSContextRec.length();
                ((SFSContext.FileEntry)localObject5).timestamp = localSFSContextRec.lastModified();
              }
              ((List)localObject2).add(localObject5);
            }
            for (;;)
            {
              i += 1;
              break label266;
              localObject5 = ((List)localObject4).iterator();
              for (;;)
              {
                localObject2 = localObject4;
                localObject3 = paramString;
                if (!((Iterator)localObject5).hasNext()) {
                  break;
                }
                localObject2 = (SFSContext.FileEntry)((Iterator)localObject5).next();
                ((SFSContext.FileEntry)localObject2).name = (localSFSContextRec.eeG + ((SFSContext.FileEntry)localObject2).name);
              }
              localObject2 = new ArrayList();
              localObject3 = paramString;
              break;
              localSFSContextRec.isDirectory();
            }
          }
        }
      } while (!paramString.isEmpty());
    }
    eez.readLock().unlock();
    x.d("MicroMsg.FileOp", "listFiles: %s [%d]", new Object[] { localObject3, Integer.valueOf(((List)localObject2).size()) });
    return (List<SFSContext.FileEntry>)localObject2;
  }
  
  public static boolean I(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    Object localObject2 = mF(paramString);
    Iterator localIterator;
    if (localObject2 != null)
    {
      localObject1 = paramString;
      try
      {
        if (paramString.equals(((SFSContextRec)localObject2).eeG))
        {
          localObject1 = paramString;
          localObject2 = ((SFSContextRec)localObject2).eeK;
          localObject1 = paramString;
          if (((SFSContext)localObject2).mNativePtr == 0L)
          {
            localObject1 = paramString;
            throw new IllegalArgumentException("Reuse already released SFSContext.");
          }
        }
      }
      catch (IOException paramString)
      {
        x.printErrStackTrace("MicroMsg.FileOp", paramString, "deleteDirIncludedFiles failed: " + (String)localObject1, new Object[0]);
        paramBoolean = false;
      }
      for (;;)
      {
        eez.readLock().unlock();
        return paramBoolean;
        localObject1 = paramString;
        if (SFSContext.nativeClear(((SFSContext)localObject2).mNativePtr) != 0)
        {
          localObject1 = paramString;
          throw new IOException(SFSContext.nativeErrorMessage());
          localObject1 = paramString;
          paramString = paramString.substring(((SFSContextRec)localObject2).eeG.length());
          localObject1 = paramString;
          localIterator = ((SFSContextRec)localObject2).eeK.mT(paramString).iterator();
          for (;;)
          {
            localObject1 = paramString;
            if (!localIterator.hasNext()) {
              break;
            }
            localObject1 = paramString;
            SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)localIterator.next();
            localObject1 = paramString;
            ((SFSContextRec)localObject2).eeK.jy(localFileEntry.name);
          }
        }
        paramBoolean = true;
      }
    }
    Object localObject1 = new File(paramString);
    paramString = new ArrayDeque();
    paramString.add(new a((File)localObject1));
    label400:
    for (;;)
    {
      localObject1 = (a)paramString.getLast();
      if (((a)localObject1).eeF == null) {
        ((a)localObject1).eeF = ((a)localObject1).eeE.listFiles();
      }
      if (((a)localObject1).eeF == null) {
        if (!paramBoolean) {
          ((a)localObject1).eeE.delete();
        }
      }
      for (;;)
      {
        if (!paramString.isEmpty()) {
          break label400;
        }
        paramBoolean = true;
        break;
        localObject2 = ((a)localObject1).eeF;
        int i = ((a)localObject1).pos;
        if (i < localObject2.length)
        {
          localIterator = localObject2[i];
          if (localIterator.isFile()) {
            localIterator.delete();
          }
          while (!localIterator.isDirectory())
          {
            i += 1;
            break;
          }
          ((a)localObject1).pos = i;
          paramString.add(new a(localIterator));
        }
        else
        {
          if (!paramBoolean) {
            ((a)localObject1).eeE.delete();
          }
          paramString.removeLast();
        }
      }
    }
  }
  
  private static void QG()
  {
    Object localObject1 = new Bundle();
    eez.readLock().lock();
    Object localObject2 = eeA.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (SFSContextRec)((Iterator)localObject2).next();
      ((Bundle)localObject1).putParcelable(((SFSContextRec)localObject3).eeG, (Parcelable)localObject3);
    }
    eez.readLock().unlock();
    localObject2 = Parcel.obtain();
    ((Bundle)localObject1).writeToParcel((Parcel)localObject2, 0);
    localObject1 = eeB.getAbsolutePath();
    Object localObject3 = ((Parcel)localObject2).marshall();
    b((String)localObject1, (byte[])localObject3, localObject3.length);
    ((Parcel)localObject2).recycle();
  }
  
  public static Map<String, SFSContext.Statistics> QH()
  {
    eez.readLock().lock();
    TreeMap localTreeMap = new TreeMap();
    Iterator localIterator = eeA.values().iterator();
    while (localIterator.hasNext())
    {
      SFSContextRec localSFSContextRec = (SFSContextRec)localIterator.next();
      if ((localSFSContextRec != null) && (!localSFSContextRec.eeJ))
      {
        if (localSFSContextRec.eeK == null) {}
        try
        {
          SFSContext localSFSContext = localSFSContextRec.eeK;
          if (localSFSContext == null) {}
          try
          {
            localSFSContextRec.eeK = localSFSContextRec.eeL.create();
            localSFSContext = localSFSContextRec.eeK;
            if (localSFSContext.mNativePtr != 0L) {
              break label156;
            }
            throw new IllegalArgumentException("Reuse already released SFSContext.");
          }
          catch (Exception localException)
          {
            x.e("MicroMsg.FileOp", "Failed to create SFSContext for prefix '%s': %s", new Object[] { localSFSContextRec.eeG, localException.getMessage() });
            localSFSContextRec.eeJ = true;
          }
          continue;
        }
        finally {}
        label156:
        SFSContext.Statistics localStatistics = SFSContext.nativeStatistics(localException.mNativePtr);
        localMap.put(localSFSContextRec.eeL.mName, localStatistics);
      }
    }
    eez.readLock().unlock();
    return localMap;
  }
  
  public static void a(String paramString, SFSContext.Builder paramBuilder)
  {
    Object localObject = null;
    if (paramBuilder == null)
    {
      mC(paramString);
      return;
    }
    if (!eeC.toLowerCase().contains("fat"))
    {
      x.i("MicroMsg.FileOp", "SFS disabled on file system '%s'", new Object[] { eeC });
      return;
    }
    x.i("MicroMsg.FileOp", "SFS enabled on file system '%s'", new Object[] { eeC });
    File localFile = Environment.getExternalStorageDirectory();
    if (new File(localFile.getAbsolutePath() + "/tencent/MicroMsg/disable-sfs").exists())
    {
      x.i("MicroMsg.FileOp", "SFS disabled.");
      return;
    }
    if (paramBuilder != null)
    {
      localObject = new SFSContextRec();
      ((SFSContextRec)localObject).eeG = paramString;
      ((SFSContextRec)localObject).eeH = null;
      ((SFSContextRec)localObject).eeI = false;
      ((SFSContextRec)localObject).eeK = null;
      ((SFSContextRec)localObject).eeL = paramBuilder;
    }
    eez.writeLock().lock();
    paramBuilder = (SFSContextRec)eeA.put(paramString, localObject);
    eez.writeLock().unlock();
    if ((paramBuilder != null) && (paramBuilder.eeK != null)) {
      paramBuilder.eeK.release();
    }
    paramBuilder = Parcel.obtain();
    ((SFSContextRec)localObject).writeToParcel(paramBuilder, 0);
    localObject = paramBuilder.marshall();
    paramBuilder.recycle();
    paramBuilder = ad.getContext();
    paramBuilder.sendBroadcast(new Intent("com.tencent.mm.FileOp.registerSFS").putExtra("rec", (byte[])localObject).setPackage(paramBuilder.getPackageName()), "com.tencent.mm.permission.MM_MESSAGE");
    QG();
    x.i("MicroMsg.FileOp", "Register SFS for prefix: " + paramString);
  }
  
  private static boolean a(String paramString, SFSContextRec paramSFSContextRec)
  {
    if (paramSFSContextRec.eeH == null) {}
    for (;;)
    {
      return false;
      paramString = paramString.substring(paramSFSContextRec.eeG.length());
      int i = paramString.lastIndexOf('/');
      if (i != -1)
      {
        paramString = paramString.substring(i + 1);
        if (paramString.length() != 0)
        {
          paramSFSContextRec = paramSFSContextRec.eeH;
          int j = paramSFSContextRec.length;
          i = 0;
          while (i < j)
          {
            if (g.a(paramSFSContextRec[i], 0, paramString, 0, eeD)) {
              return true;
            }
            i += 1;
          }
        }
      }
    }
  }
  
  private static OutputStream au(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      throw new FileNotFoundException("path == null");
    }
    Object localObject = mF(paramString1);
    if (localObject == null) {}
    for (;;)
    {
      try
      {
        if (!TextUtils.isEmpty(paramString2))
        {
          paramString2 = new c(paramString1, paramString2);
          eez.readLock().unlock();
          if (localObject != null) {
            break label142;
          }
          localObject = "regular";
          x.d("MicroMsg.FileOp", "openWrite: %s [%s, %s]", new Object[] { paramString1, "ok", localObject });
          return paramString2;
        }
        paramString2 = new FileOutputStream(paramString1);
        continue;
        str = paramString1.substring(((SFSContextRec)localObject).eeG.length());
      }
      finally
      {
        eez.readLock().unlock();
      }
      String str;
      paramString2 = ((SFSContextRec)localObject).eeK.aw(str, paramString2);
      continue;
      label142:
      localObject = "SFS";
    }
  }
  
  public static boolean av(String paramString1, String paramString2)
  {
    boolean bool = true;
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0)) {
      bool = false;
    }
    String str1;
    do
    {
      return bool;
      str1 = paramString1;
      str2 = paramString2;
      if (!mE(paramString1)) {
        break;
      }
      str1 = paramString1;
      str2 = paramString2;
      if (!mE(paramString2)) {
        break;
      }
      str1 = paramString1;
      if (f.mP(paramString1)) {
        str1 = f.mQ(paramString1);
      }
      paramString1 = paramString2;
      if (f.mP(paramString2)) {
        paramString1 = f.mQ(paramString2);
      }
    } while (new File(str1).renameTo(new File(paramString1)));
    String str2 = paramString1;
    if (y(str1, str2) < 0L) {
      return false;
    }
    deleteFile(str1);
    return true;
  }
  
  /* Error */
  public static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: ifnonnull +8 -> 11
    //   6: bipush -2
    //   8: istore_2
    //   9: iload_2
    //   10: ireturn
    //   11: aload_1
    //   12: arraylength
    //   13: iload_2
    //   14: iconst_0
    //   15: iadd
    //   16: if_icmpge +6 -> 22
    //   19: bipush -3
    //   21: ireturn
    //   22: aconst_null
    //   23: astore 5
    //   25: aconst_null
    //   26: astore 4
    //   28: aload_0
    //   29: invokestatic 516	com/tencent/mm/modelsfs/FileOp:mG	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   32: astore 6
    //   34: aload 6
    //   36: astore 4
    //   38: aload 6
    //   40: astore 5
    //   42: aload 6
    //   44: aload_1
    //   45: iconst_0
    //   46: iload_2
    //   47: invokevirtual 522	java/io/OutputStream:write	([BII)V
    //   50: iload_3
    //   51: istore_2
    //   52: aload 6
    //   54: ifnull -45 -> 9
    //   57: aload 6
    //   59: invokevirtual 525	java/io/OutputStream:close	()V
    //   62: iconst_0
    //   63: ireturn
    //   64: astore_0
    //   65: iconst_0
    //   66: ireturn
    //   67: astore_1
    //   68: aload 4
    //   70: astore 5
    //   72: ldc -106
    //   74: ldc_w 527
    //   77: iconst_2
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: aload_0
    //   84: aastore
    //   85: dup
    //   86: iconst_1
    //   87: aload_1
    //   88: invokevirtual 528	java/io/IOException:getMessage	()Ljava/lang/String;
    //   91: aastore
    //   92: invokestatic 348	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload 4
    //   97: ifnull +8 -> 105
    //   100: aload 4
    //   102: invokevirtual 525	java/io/OutputStream:close	()V
    //   105: iconst_m1
    //   106: ireturn
    //   107: astore_0
    //   108: aload 5
    //   110: ifnull +8 -> 118
    //   113: aload 5
    //   115: invokevirtual 525	java/io/OutputStream:close	()V
    //   118: aload_0
    //   119: athrow
    //   120: astore_0
    //   121: goto -16 -> 105
    //   124: astore_1
    //   125: goto -7 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramString	String
    //   0	128	1	paramArrayOfByte	byte[]
    //   0	128	2	paramInt	int
    //   1	50	3	i	int
    //   26	75	4	localObject1	Object
    //   23	91	5	localObject2	Object
    //   32	26	6	localOutputStream	OutputStream
    // Exception table:
    //   from	to	target	type
    //   57	62	64	java/io/IOException
    //   28	34	67	java/io/IOException
    //   42	50	67	java/io/IOException
    //   28	34	107	finally
    //   42	50	107	finally
    //   72	95	107	finally
    //   100	105	120	java/io/IOException
    //   113	118	124	java/io/IOException
  }
  
  public static boolean cn(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    SFSContextRec localSFSContextRec = mF(paramString);
    boolean bool1;
    if (localSFSContextRec != null)
    {
      SFSContext localSFSContext = localSFSContextRec.eeK;
      String str2 = paramString.substring(localSFSContextRec.eeG.length());
      if (localSFSContext.mNativePtr == 0L) {
        throw new IllegalArgumentException("Reuse already released SFSContext.");
      }
      str1 = str2;
      if (f.mP(str2))
      {
        f.mR(str2);
        str1 = f.mQ(str2);
      }
      boolean bool2 = SFSContext.nativeExists(localSFSContext.mNativePtr, str1);
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (localSFSContextRec.eeI) {
          bool1 = new File(paramString).exists();
        }
      }
      eez.readLock().unlock();
      if (localSFSContextRec != null) {
        break label188;
      }
    }
    label188:
    for (String str1 = "regular";; str1 = "SFS")
    {
      x.d("MicroMsg.FileOp", "fileExists: %s [%b, %s]", new Object[] { paramString, Boolean.valueOf(bool1), str1 });
      return bool1;
      bool1 = new File(paramString).exists();
      break;
    }
  }
  
  /* Error */
  public static String ct(String paramString)
  {
    // Byte code:
    //   0: new 97	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   7: astore 4
    //   9: new 547	java/io/InputStreamReader
    //   12: dup
    //   13: aload_0
    //   14: invokestatic 551	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   17: invokespecial 554	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   20: astore_3
    //   21: aload_3
    //   22: astore_2
    //   23: sipush 512
    //   26: newarray <illegal type>
    //   28: astore 5
    //   30: aload_3
    //   31: astore_2
    //   32: aload_3
    //   33: aload 5
    //   35: invokevirtual 558	java/io/InputStreamReader:read	([C)I
    //   38: istore_1
    //   39: iload_1
    //   40: iconst_m1
    //   41: if_icmpeq +62 -> 103
    //   44: aload_3
    //   45: astore_2
    //   46: aload 4
    //   48: aload 5
    //   50: iconst_0
    //   51: iload_1
    //   52: invokevirtual 561	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: goto -26 -> 30
    //   59: astore 4
    //   61: aload_3
    //   62: astore_2
    //   63: ldc -106
    //   65: ldc_w 563
    //   68: iconst_2
    //   69: anewarray 4	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_0
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: aload 4
    //   80: invokevirtual 528	java/io/IOException:getMessage	()Ljava/lang/String;
    //   83: aastore
    //   84: invokestatic 348	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_3
    //   88: astore_2
    //   89: aload 4
    //   91: athrow
    //   92: astore_0
    //   93: aload_2
    //   94: ifnull +7 -> 101
    //   97: aload_2
    //   98: invokevirtual 564	java/io/InputStreamReader:close	()V
    //   101: aload_0
    //   102: athrow
    //   103: aload_3
    //   104: invokevirtual 564	java/io/InputStreamReader:close	()V
    //   107: aload 4
    //   109: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: areturn
    //   113: astore_0
    //   114: goto -7 -> 107
    //   117: astore_2
    //   118: goto -17 -> 101
    //   121: astore_0
    //   122: aconst_null
    //   123: astore_2
    //   124: goto -31 -> 93
    //   127: astore 4
    //   129: aconst_null
    //   130: astore_3
    //   131: goto -70 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	paramString	String
    //   38	14	1	i	int
    //   22	76	2	localInputStreamReader1	java.io.InputStreamReader
    //   117	1	2	localIOException1	IOException
    //   123	1	2	localObject	Object
    //   20	111	3	localInputStreamReader2	java.io.InputStreamReader
    //   7	40	4	localStringBuilder	StringBuilder
    //   59	49	4	localIOException2	IOException
    //   127	1	4	localIOException3	IOException
    //   28	21	5	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   23	30	59	java/io/IOException
    //   32	39	59	java/io/IOException
    //   46	56	59	java/io/IOException
    //   23	30	92	finally
    //   32	39	92	finally
    //   46	56	92	finally
    //   63	87	92	finally
    //   89	92	92	finally
    //   103	107	113	java/io/IOException
    //   97	101	117	java/io/IOException
    //   9	21	121	finally
    //   9	21	127	java/io/IOException
  }
  
  public static boolean deleteFile(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    SFSContextRec localSFSContextRec = mF(paramString);
    boolean bool1;
    if (localSFSContextRec != null)
    {
      str = paramString.substring(localSFSContextRec.eeG.length());
      boolean bool2 = localSFSContextRec.eeK.jy(str);
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (localSFSContextRec.eeI) {
          if (!f.mP(paramString)) {
            break label173;
          }
        }
      }
    }
    label105:
    label168:
    label173:
    for (String str = f.mQ(paramString);; str = paramString)
    {
      bool1 = new File(str).delete();
      eez.readLock().unlock();
      if (localSFSContextRec == null)
      {
        str = "regular";
        x.d("MicroMsg.FileOp", "deleteFile: %s [%b, %s]", new Object[] { paramString, Boolean.valueOf(bool1), str });
        return bool1;
        if (!f.mP(paramString)) {
          break label168;
        }
      }
      for (str = f.mQ(paramString);; str = paramString)
      {
        bool1 = new File(str).delete();
        break;
        str = "SFS";
        break label105;
      }
    }
  }
  
  /* Error */
  public static byte[] e(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: iload_2
    //   7: ifge +113 -> 120
    //   10: sipush 2048
    //   13: istore_3
    //   14: new 569	java/io/ByteArrayOutputStream
    //   17: dup
    //   18: iload_3
    //   19: invokespecial 572	java/io/ByteArrayOutputStream:<init>	(I)V
    //   22: astore 8
    //   24: aload_0
    //   25: invokestatic 551	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   28: astore 7
    //   30: iload_1
    //   31: ifle +19 -> 50
    //   34: iload_1
    //   35: i2l
    //   36: lstore 4
    //   38: aload 7
    //   40: astore 6
    //   42: aload 7
    //   44: lload 4
    //   46: invokevirtual 578	java/io/InputStream:skip	(J)J
    //   49: pop2
    //   50: aload 7
    //   52: astore 6
    //   54: sipush 1024
    //   57: newarray <illegal type>
    //   59: astore 9
    //   61: iload_2
    //   62: istore_1
    //   63: iload_2
    //   64: ifge +7 -> 71
    //   67: ldc_w 579
    //   70: istore_1
    //   71: aload 7
    //   73: astore 6
    //   75: aload 7
    //   77: aload 9
    //   79: iconst_0
    //   80: iload_1
    //   81: sipush 1024
    //   84: invokestatic 585	java/lang/Math:min	(II)I
    //   87: invokevirtual 588	java/io/InputStream:read	([BII)I
    //   90: istore_2
    //   91: iload_2
    //   92: iconst_m1
    //   93: if_icmpeq +32 -> 125
    //   96: iload_1
    //   97: ifle +28 -> 125
    //   100: aload 7
    //   102: astore 6
    //   104: aload 8
    //   106: aload 9
    //   108: iconst_0
    //   109: iload_2
    //   110: invokevirtual 589	java/io/ByteArrayOutputStream:write	([BII)V
    //   113: iload_1
    //   114: iload_2
    //   115: isub
    //   116: istore_1
    //   117: goto -46 -> 71
    //   120: iload_2
    //   121: istore_3
    //   122: goto -108 -> 14
    //   125: aload 7
    //   127: ifnull +8 -> 135
    //   130: aload 7
    //   132: invokevirtual 590	java/io/InputStream:close	()V
    //   135: aload 8
    //   137: invokevirtual 593	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   140: astore 6
    //   142: aload 8
    //   144: invokevirtual 594	java/io/ByteArrayOutputStream:close	()V
    //   147: ldc -106
    //   149: ldc_w 596
    //   152: iconst_2
    //   153: anewarray 4	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload_0
    //   159: aastore
    //   160: dup
    //   161: iconst_1
    //   162: aload 6
    //   164: arraylength
    //   165: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   168: aastore
    //   169: invokestatic 232	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload 6
    //   174: areturn
    //   175: astore 8
    //   177: aconst_null
    //   178: astore 7
    //   180: aload 7
    //   182: astore 6
    //   184: ldc -106
    //   186: new 97	java/lang/StringBuilder
    //   189: dup
    //   190: ldc_w 598
    //   193: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: aload_0
    //   197: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: ldc_w 600
    //   203: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: aload 8
    //   208: invokevirtual 528	java/io/IOException:getMessage	()Ljava/lang/String;
    //   211: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: invokestatic 603	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload 7
    //   222: ifnull +8 -> 230
    //   225: aload 7
    //   227: invokevirtual 590	java/io/InputStream:close	()V
    //   230: aconst_null
    //   231: areturn
    //   232: astore_0
    //   233: aconst_null
    //   234: astore 6
    //   236: aload 6
    //   238: ifnull +8 -> 246
    //   241: aload 6
    //   243: invokevirtual 590	java/io/InputStream:close	()V
    //   246: aload_0
    //   247: athrow
    //   248: astore 6
    //   250: goto -115 -> 135
    //   253: astore_0
    //   254: goto -24 -> 230
    //   257: astore 6
    //   259: goto -13 -> 246
    //   262: astore 7
    //   264: goto -117 -> 147
    //   267: astore_0
    //   268: goto -32 -> 236
    //   271: astore 8
    //   273: goto -93 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramString	String
    //   0	276	1	paramInt1	int
    //   0	276	2	paramInt2	int
    //   13	109	3	i	int
    //   36	9	4	l	long
    //   40	202	6	localObject	Object
    //   248	1	6	localIOException1	IOException
    //   257	1	6	localIOException2	IOException
    //   28	198	7	localInputStream	InputStream
    //   262	1	7	localIOException3	IOException
    //   22	121	8	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   175	32	8	localIOException4	IOException
    //   271	1	8	localIOException5	IOException
    //   59	48	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   24	30	175	java/io/IOException
    //   24	30	232	finally
    //   130	135	248	java/io/IOException
    //   225	230	253	java/io/IOException
    //   241	246	257	java/io/IOException
    //   142	147	262	java/io/IOException
    //   42	50	267	finally
    //   54	61	267	finally
    //   75	91	267	finally
    //   104	113	267	finally
    //   184	220	267	finally
    //   42	50	271	java/io/IOException
    //   54	61	271	java/io/IOException
    //   75	91	271	java/io/IOException
    //   104	113	271	java/io/IOException
  }
  
  public static boolean i(String paramString1, String paramString2, String paramString3)
  {
    return av(paramString1 + paramString2, paramString1 + paramString3);
  }
  
  public static void init(boolean paramBoolean)
  {
    Context localContext = ad.getContext();
    eeB = new File(localContext.getFilesDir(), "fileop_mapping");
    eeC = ax.Wz(com.tencent.mm.loader.stub.b.bnC);
    if (paramBoolean)
    {
      eeB.delete();
      return;
    }
    x.i("MicroMsg.FileOp", "Initializing FileOp mapping slave.");
    if (eeB.exists())
    {
      localObject1 = e(eeB.getAbsolutePath(), 0, -1);
      if (localObject1 != null)
      {
        localObject2 = Parcel.obtain();
        ((Parcel)localObject2).unmarshall((byte[])localObject1, 0, localObject1.length);
        ((Parcel)localObject2).setDataPosition(0);
        localObject1 = ((Parcel)localObject2).readBundle(SFSContextRec.class.getClassLoader());
        ((Parcel)localObject2).recycle();
        eez.writeLock().lock();
        localObject2 = ((Bundle)localObject1).keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          SFSContextRec localSFSContextRec = (SFSContextRec)((Bundle)localObject1).getParcelable(str);
          localSFSContextRec = (SFSContextRec)eeA.put(str, localSFSContextRec);
          if ((localSFSContextRec != null) && (localSFSContextRec.eeK != null)) {
            localSFSContextRec.eeK.release();
          }
          x.i("MicroMsg.FileOp", "Load mapping from file: " + str);
        }
        eez.writeLock().unlock();
      }
    }
    Object localObject1 = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (paramAnonymousIntent.getAction().equals("com.tencent.mm.FileOp.registerSFS"))
        {
          paramAnonymousIntent = paramAnonymousIntent.getByteArrayExtra("rec");
          if (paramAnonymousIntent != null) {}
        }
        do
        {
          do
          {
            return;
            paramAnonymousContext = Parcel.obtain();
            paramAnonymousContext.unmarshall(paramAnonymousIntent, 0, paramAnonymousIntent.length);
            paramAnonymousContext.setDataPosition(0);
            localSFSContextRec = (FileOp.SFSContextRec)FileOp.SFSContextRec.CREATOR.createFromParcel(paramAnonymousContext);
          } while (localSFSContextRec == null);
          paramAnonymousIntent = localSFSContextRec.eeG;
          FileOp.QI().writeLock().lock();
          FileOp.SFSContextRec localSFSContextRec = (FileOp.SFSContextRec)FileOp.QJ().put(paramAnonymousIntent, localSFSContextRec);
          FileOp.QI().writeLock().unlock();
          if ((localSFSContextRec != null) && (localSFSContextRec.eeK != null)) {
            localSFSContextRec.eeK.release();
          }
          x.i("MicroMsg.FileOp", "Load mapping from broadcast: " + paramAnonymousIntent);
          paramAnonymousContext.recycle();
          return;
          if (paramAnonymousIntent.getAction().equals("com.tencent.mm.FileOp.unregisterSFS"))
          {
            paramAnonymousContext = paramAnonymousIntent.getStringExtra("prefix");
            FileOp.QI().writeLock().lock();
            paramAnonymousIntent = (FileOp.SFSContextRec)FileOp.QJ().remove(paramAnonymousContext);
            FileOp.QI().writeLock().unlock();
            if ((paramAnonymousIntent != null) && (paramAnonymousIntent.eeK != null)) {
              paramAnonymousIntent.eeK.release();
            }
            x.i("MicroMsg.FileOp", "Unload mapping from broadcast: " + paramAnonymousContext);
            return;
          }
        } while (!paramAnonymousIntent.getAction().equals("com.tencent.mm.FileOp.clearSFS"));
        FileOp.QI().writeLock().lock();
        paramAnonymousContext = FileOp.QJ().values().iterator();
        while (paramAnonymousContext.hasNext())
        {
          paramAnonymousIntent = (FileOp.SFSContextRec)paramAnonymousContext.next();
          if ((paramAnonymousIntent != null) && (paramAnonymousIntent.eeK != null)) {
            paramAnonymousIntent.eeK.release();
          }
        }
        FileOp.QJ().clear();
        FileOp.QI().writeLock().unlock();
        x.i("MicroMsg.FileOp", "Clear mapping from broadcast.");
      }
    };
    Object localObject2 = new IntentFilter();
    ((IntentFilter)localObject2).addAction("com.tencent.mm.FileOp.registerSFS");
    ((IntentFilter)localObject2).addAction("com.tencent.mm.FileOp.unregisterSFS");
    ((IntentFilter)localObject2).addAction("com.tencent.mm.FileOp.clearSFS");
    localContext.registerReceiver((BroadcastReceiver)localObject1, (IntentFilter)localObject2, "com.tencent.mm.permission.MM_MESSAGE", null);
  }
  
  public static OutputStream jx(String paramString)
  {
    return mG(paramString);
  }
  
  public static int l(String paramString, byte[] paramArrayOfByte)
  {
    return b(paramString, paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public static void mC(String paramString)
  {
    eez.writeLock().lock();
    Object localObject = (SFSContextRec)eeA.remove(paramString);
    eez.writeLock().unlock();
    if ((localObject != null) && (((SFSContextRec)localObject).eeK != null)) {
      ((SFSContextRec)localObject).eeK.release();
    }
    localObject = ad.getContext();
    ((Context)localObject).sendBroadcast(new Intent("com.tencent.mm.FileOp.unregisterSFS").putExtra("prefix", paramString).setPackage(((Context)localObject).getPackageName()), "com.tencent.mm.permission.MM_MESSAGE");
    QG();
    x.i("MicroMsg.FileOp", "Unregister SFS for prefix: " + paramString);
  }
  
  private static boolean mD(String paramString)
  {
    eez.readLock().lock();
    Map.Entry localEntry = eeA.floorEntry(paramString);
    if ((localEntry != null) && (paramString.startsWith((String)localEntry.getKey())))
    {
      paramString = (SFSContextRec)localEntry.getValue();
      if ((paramString.eeJ) || (paramString.eeH != null) || (paramString.eeI)) {}
    }
    for (boolean bool = false;; bool = true)
    {
      eez.readLock().unlock();
      return bool;
    }
  }
  
  private static boolean mE(String paramString)
  {
    eez.readLock().lock();
    Object localObject = eeA.floorEntry(paramString);
    if ((localObject != null) && (paramString.startsWith((String)((Map.Entry)localObject).getKey())))
    {
      localObject = (SFSContextRec)((Map.Entry)localObject).getValue();
      if ((((SFSContextRec)localObject).eeJ) || (a(paramString, (SFSContextRec)localObject))) {}
    }
    for (boolean bool = false;; bool = true)
    {
      eez.readLock().unlock();
      return bool;
    }
  }
  
  /* Error */
  private static SFSContextRec mF(String paramString)
  {
    // Byte code:
    //   0: getstatic 35	com/tencent/mm/modelsfs/FileOp:eez	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   3: invokevirtual 213	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   6: invokevirtual 289	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   9: getstatic 40	com/tencent/mm/modelsfs/FileOp:eeA	Ljava/util/TreeMap;
    //   12: aload_0
    //   13: invokevirtual 693	java/util/TreeMap:floorEntry	(Ljava/lang/Object;)Ljava/util/Map$Entry;
    //   16: astore_1
    //   17: aload_1
    //   18: ifnonnull +7 -> 25
    //   21: aconst_null
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: aload_0
    //   26: aload_1
    //   27: invokeinterface 698 1 0
    //   32: checkcast 68	java/lang/String
    //   35: invokevirtual 701	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   38: ifeq +114 -> 152
    //   41: aload_1
    //   42: invokeinterface 704 1 0
    //   47: checkcast 8	com/tencent/mm/modelsfs/FileOp$SFSContextRec
    //   50: astore_2
    //   51: aload_2
    //   52: astore_1
    //   53: aload_0
    //   54: aload_2
    //   55: invokestatic 706	com/tencent/mm/modelsfs/FileOp:a	(Ljava/lang/String;Lcom/tencent/mm/modelsfs/FileOp$SFSContextRec;)Z
    //   58: ifeq +5 -> 63
    //   61: aconst_null
    //   62: astore_1
    //   63: aload_1
    //   64: ifnull +86 -> 150
    //   67: aload_1
    //   68: getfield 330	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeJ	Z
    //   71: ifne +79 -> 150
    //   74: aload_1
    //   75: astore_0
    //   76: aload_1
    //   77: getfield 110	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeK	Lcom/tencent/mm/modelsfs/SFSContext;
    //   80: ifnonnull -57 -> 23
    //   83: aload_1
    //   84: monitorenter
    //   85: aload_1
    //   86: getfield 110	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeK	Lcom/tencent/mm/modelsfs/SFSContext;
    //   89: astore_0
    //   90: aload_0
    //   91: ifnonnull +14 -> 105
    //   94: aload_1
    //   95: aload_1
    //   96: getfield 334	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeL	Lcom/tencent/mm/modelsfs/SFSContext$Builder;
    //   99: invokevirtual 340	com/tencent/mm/modelsfs/SFSContext$Builder:create	()Lcom/tencent/mm/modelsfs/SFSContext;
    //   102: putfield 110	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeK	Lcom/tencent/mm/modelsfs/SFSContext;
    //   105: aload_1
    //   106: monitorexit
    //   107: aload_1
    //   108: areturn
    //   109: astore_0
    //   110: aload_1
    //   111: monitorexit
    //   112: aload_0
    //   113: athrow
    //   114: astore_0
    //   115: ldc -106
    //   117: ldc_w 342
    //   120: iconst_2
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: aload_1
    //   127: getfield 85	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeG	Ljava/lang/String;
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: aload_0
    //   134: invokevirtual 345	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   137: aastore
    //   138: invokestatic 348	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload_1
    //   142: iconst_1
    //   143: putfield 330	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeJ	Z
    //   146: aload_1
    //   147: monitorexit
    //   148: aconst_null
    //   149: areturn
    //   150: aconst_null
    //   151: areturn
    //   152: aconst_null
    //   153: astore_1
    //   154: goto -91 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	paramString	String
    //   16	138	1	localObject	Object
    //   50	5	2	localSFSContextRec	SFSContextRec
    // Exception table:
    //   from	to	target	type
    //   85	90	109	finally
    //   94	105	109	finally
    //   105	107	109	finally
    //   110	112	109	finally
    //   115	148	109	finally
    //   94	105	114	java/lang/Exception
  }
  
  public static OutputStream mG(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new FileNotFoundException("path == null");
    }
    String str2 = "";
    String str1 = paramString;
    if (f.mP(paramString))
    {
      str2 = f.mS(paramString);
      str1 = f.mQ(paramString);
    }
    return au(str1, str2);
  }
  
  /* Error */
  public static boolean mH(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 72	java/lang/String:length	()I
    //   8: ifne +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: invokestatic 82	com/tencent/mm/modelsfs/FileOp:mF	(Ljava/lang/String;)Lcom/tencent/mm/modelsfs/FileOp$SFSContextRec;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnonnull +14 -> 33
    //   22: getstatic 35	com/tencent/mm/modelsfs/FileOp:eez	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   25: invokevirtual 213	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   28: invokevirtual 218	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   31: iconst_1
    //   32: ireturn
    //   33: aload_0
    //   34: aload_2
    //   35: getfield 85	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeG	Ljava/lang/String;
    //   38: invokevirtual 72	java/lang/String:length	()I
    //   41: invokevirtual 89	java/lang/String:substring	(I)Ljava/lang/String;
    //   44: astore_3
    //   45: aload_2
    //   46: getfield 110	com/tencent/mm/modelsfs/FileOp$SFSContextRec:eeK	Lcom/tencent/mm/modelsfs/SFSContext;
    //   49: aload_3
    //   50: invokevirtual 713	com/tencent/mm/modelsfs/SFSContext:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   53: astore_2
    //   54: new 174	java/io/File
    //   57: dup
    //   58: aload_0
    //   59: invokespecial 175	java/io/File:<init>	(Ljava/lang/String;)V
    //   62: invokevirtual 716	java/io/File:getParent	()Ljava/lang/String;
    //   65: astore_3
    //   66: aload_3
    //   67: invokestatic 721	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   70: ifne +15 -> 85
    //   73: new 174	java/io/File
    //   76: dup
    //   77: aload_3
    //   78: invokespecial 175	java/io/File:<init>	(Ljava/lang/String;)V
    //   81: invokevirtual 724	java/io/File:mkdirs	()Z
    //   84: pop
    //   85: new 481	java/io/FileOutputStream
    //   88: dup
    //   89: aload_0
    //   90: invokespecial 482	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   93: astore_3
    //   94: aload_3
    //   95: astore 5
    //   97: aload_2
    //   98: astore 4
    //   100: sipush 1024
    //   103: newarray <illegal type>
    //   105: astore 6
    //   107: aload_3
    //   108: astore 5
    //   110: aload_2
    //   111: astore 4
    //   113: aload_2
    //   114: aload 6
    //   116: invokevirtual 727	java/io/InputStream:read	([B)I
    //   119: istore_1
    //   120: iload_1
    //   121: iconst_m1
    //   122: if_icmpeq +79 -> 201
    //   125: aload_3
    //   126: astore 5
    //   128: aload_2
    //   129: astore 4
    //   131: aload_3
    //   132: aload 6
    //   134: iconst_0
    //   135: iload_1
    //   136: invokevirtual 522	java/io/OutputStream:write	([BII)V
    //   139: goto -32 -> 107
    //   142: astore 6
    //   144: aload_3
    //   145: astore 5
    //   147: aload_2
    //   148: astore 4
    //   150: ldc -106
    //   152: ldc_w 729
    //   155: iconst_2
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_0
    //   162: aastore
    //   163: dup
    //   164: iconst_1
    //   165: aload 6
    //   167: invokevirtual 528	java/io/IOException:getMessage	()Ljava/lang/String;
    //   170: aastore
    //   171: invokestatic 348	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: aload_2
    //   175: ifnull +7 -> 182
    //   178: aload_2
    //   179: invokevirtual 590	java/io/InputStream:close	()V
    //   182: aload_3
    //   183: ifnull +7 -> 190
    //   186: aload_3
    //   187: invokevirtual 525	java/io/OutputStream:close	()V
    //   190: getstatic 35	com/tencent/mm/modelsfs/FileOp:eez	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   193: invokevirtual 213	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   196: invokevirtual 218	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   199: iconst_0
    //   200: ireturn
    //   201: aload_2
    //   202: invokevirtual 590	java/io/InputStream:close	()V
    //   205: aload_3
    //   206: invokevirtual 525	java/io/OutputStream:close	()V
    //   209: getstatic 35	com/tencent/mm/modelsfs/FileOp:eez	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   212: invokevirtual 213	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   215: invokevirtual 218	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   218: iconst_1
    //   219: ireturn
    //   220: astore_0
    //   221: aconst_null
    //   222: astore 5
    //   224: aconst_null
    //   225: astore_2
    //   226: aload_2
    //   227: ifnull +7 -> 234
    //   230: aload_2
    //   231: invokevirtual 590	java/io/InputStream:close	()V
    //   234: aload 5
    //   236: ifnull +8 -> 244
    //   239: aload 5
    //   241: invokevirtual 525	java/io/OutputStream:close	()V
    //   244: getstatic 35	com/tencent/mm/modelsfs/FileOp:eez	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   247: invokevirtual 213	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   250: invokevirtual 218	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   253: aload_0
    //   254: athrow
    //   255: astore_0
    //   256: goto -51 -> 205
    //   259: astore_0
    //   260: goto -51 -> 209
    //   263: astore_0
    //   264: goto -82 -> 182
    //   267: astore_0
    //   268: goto -78 -> 190
    //   271: astore_2
    //   272: goto -38 -> 234
    //   275: astore_2
    //   276: goto -32 -> 244
    //   279: astore_0
    //   280: aconst_null
    //   281: astore 5
    //   283: goto -57 -> 226
    //   286: astore_0
    //   287: aload 4
    //   289: astore_2
    //   290: goto -64 -> 226
    //   293: astore 6
    //   295: aconst_null
    //   296: astore_3
    //   297: aconst_null
    //   298: astore_2
    //   299: goto -155 -> 144
    //   302: astore 6
    //   304: aconst_null
    //   305: astore_3
    //   306: goto -162 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	paramString	String
    //   119	17	1	i	int
    //   17	214	2	localObject1	Object
    //   271	1	2	localIOException1	IOException
    //   275	1	2	localIOException2	IOException
    //   289	10	2	localObject2	Object
    //   44	262	3	localObject3	Object
    //   98	190	4	localObject4	Object
    //   95	187	5	localObject5	Object
    //   105	28	6	arrayOfByte	byte[]
    //   142	24	6	localIOException3	IOException
    //   293	1	6	localIOException4	IOException
    //   302	1	6	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   100	107	142	java/io/IOException
    //   113	120	142	java/io/IOException
    //   131	139	142	java/io/IOException
    //   33	54	220	finally
    //   201	205	255	java/io/IOException
    //   205	209	259	java/io/IOException
    //   178	182	263	java/io/IOException
    //   186	190	267	java/io/IOException
    //   230	234	271	java/io/IOException
    //   239	244	275	java/io/IOException
    //   54	85	279	finally
    //   85	94	279	finally
    //   100	107	286	finally
    //   113	120	286	finally
    //   131	139	286	finally
    //   150	174	286	finally
    //   33	54	293	java/io/IOException
    //   54	85	302	java/io/IOException
    //   85	94	302	java/io/IOException
  }
  
  public static long mI(String paramString)
  {
    long l = 0L;
    if (paramString == null) {
      return 0L;
    }
    SFSContextRec localSFSContextRec = mF(paramString);
    if (localSFSContextRec != null)
    {
      localObject = paramString.substring(localSFSContextRec.eeG.length());
      localObject = localSFSContextRec.eeK.mU((String)localObject);
      if (localObject == null) {
        if (localSFSContextRec.eeI) {
          if (!f.mP(paramString)) {
            break label172;
          }
        }
      }
    }
    label96:
    label172:
    for (Object localObject = f.mQ(paramString);; localObject = paramString)
    {
      for (l = new File((String)localObject).length();; l = ((SFSContext.FileEntry)localObject).size)
      {
        eez.readLock().unlock();
        if (localSFSContextRec != null) {
          break;
        }
        localObject = "regular";
        x.d("MicroMsg.FileOp", "readFileLength: %s [%d, %s]", new Object[] { paramString, Long.valueOf(l), localObject });
        return l;
      }
      if (f.mP(paramString)) {}
      for (localObject = f.mQ(paramString);; localObject = paramString)
      {
        l = new File((String)localObject).length();
        break;
        localObject = "SFS";
        break label96;
      }
    }
  }
  
  public static long mJ(String paramString)
  {
    long l = 0L;
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0L;
    }
    Object localObject1 = mF(paramString);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = paramString.substring(((SFSContextRec)localObject1).eeG.length());
      localObject2 = ((SFSContextRec)localObject1).eeK.mU((String)localObject2);
      if (localObject2 == null)
      {
        if (((SFSContextRec)localObject1).eeI) {
          l = new File(paramString).lastModified();
        }
        eez.readLock().unlock();
        if (localObject1 != null) {
          break label146;
        }
      }
    }
    label146:
    for (localObject1 = "regular";; localObject1 = "SFS")
    {
      x.d("MicroMsg.FileOp", "getFileTime: %s [%d, %s]", new Object[] { paramString, Long.valueOf(l), localObject1 });
      return l;
      l = ((SFSContext.FileEntry)localObject2).timestamp * 1000L;
      break;
      l = new File(paramString).lastModified();
      break;
    }
  }
  
  public static String mK(String paramString)
  {
    return new File(f.mQ(paramString)).getParentFile().getAbsolutePath();
  }
  
  public static boolean mL(String paramString)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramString == null) || (paramString.length() == 0)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        paramString = f.mQ(paramString);
        bool1 = bool2;
      } while (!mD(paramString));
      paramString = new File(paramString);
      if (!paramString.exists()) {
        break;
      }
      bool1 = bool2;
    } while (paramString.isDirectory());
    return paramString.mkdirs();
  }
  
  /* Error */
  public static boolean mM(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 72	java/lang/String:length	()I
    //   8: ifne +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: invokestatic 756	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   17: ifne +12 -> 29
    //   20: aload_0
    //   21: invokestatic 516	com/tencent/mm/modelsfs/FileOp:mG	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 525	java/io/OutputStream:close	()V
    //   29: iconst_1
    //   30: ireturn
    //   31: astore_1
    //   32: ldc -106
    //   34: ldc_w 758
    //   37: iconst_2
    //   38: anewarray 4	java/lang/Object
    //   41: dup
    //   42: iconst_0
    //   43: aload_0
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: aload_1
    //   48: invokevirtual 528	java/io/IOException:getMessage	()Ljava/lang/String;
    //   51: aastore
    //   52: invokestatic 348	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: iconst_0
    //   56: ireturn
    //   57: astore_0
    //   58: goto -29 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramString	String
    //   24	2	1	localOutputStream	OutputStream
    //   31	17	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   20	25	31	java/io/IOException
    //   25	29	57	java/io/IOException
  }
  
  public static void mN(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    while (!mD(paramString)) {
      return;
    }
    try
    {
      new File(paramString, ".nomedia").createNewFile();
      return;
    }
    catch (IOException localIOException)
    {
      x.e("MicroMsg.FileOp", "markNoMedia '%s' failed: %s", new Object[] { paramString, localIOException.getMessage() });
    }
  }
  
  public static String mO(String paramString)
  {
    if (!cn(paramString)) {
      return null;
    }
    long l = mI(paramString);
    return com.tencent.mm.a.g.u((paramString + "-" + l).getBytes());
  }
  
  public static InputStream openRead(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new FileNotFoundException("path == null");
    }
    Object localObject2 = mF(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      try
      {
        if (f.mP(paramString))
        {
          long l = f.mR(paramString);
          localObject1 = new b(f.mQ(paramString), l);
          eez.readLock().unlock();
          if (localObject2 != null) {
            break label179;
          }
          localObject2 = "regular";
          x.d("MicroMsg.FileOp", "openRead: %s [%s, %s]", new Object[] { paramString, "ok", localObject2 });
          return (InputStream)localObject1;
        }
        Object localObject1 = new FileInputStream(paramString);
        continue;
        try
        {
          localObject1 = paramString.substring(((SFSContextRec)localObject2).eeG.length());
          localObject1 = ((SFSContextRec)localObject2).eeK.openRead((String)localObject1);
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          if (!((SFSContextRec)localObject2).eeI) {
            throw localFileNotFoundException;
          }
          FileInputStream localFileInputStream = new FileInputStream(paramString);
        }
      }
      finally
      {
        eez.readLock().unlock();
      }
      continue;
      label179:
      localObject2 = "SFS";
    }
  }
  
  /* Error */
  public static long y(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +21 -> 22
    //   4: aload_0
    //   5: invokevirtual 72	java/lang/String:length	()I
    //   8: ifeq +14 -> 22
    //   11: aload_1
    //   12: ifnull +10 -> 22
    //   15: aload_1
    //   16: invokevirtual 72	java/lang/String:length	()I
    //   19: ifne +11 -> 30
    //   22: ldc2_w 795
    //   25: lstore 5
    //   27: lload 5
    //   29: lreturn
    //   30: lconst_0
    //   31: lstore_3
    //   32: aload_0
    //   33: invokestatic 551	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   36: astore 8
    //   38: aload_1
    //   39: invokestatic 516	com/tencent/mm/modelsfs/FileOp:mG	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   42: astore 7
    //   44: sipush 1024
    //   47: newarray <illegal type>
    //   49: astore 9
    //   51: aload 8
    //   53: aload 9
    //   55: invokevirtual 727	java/io/InputStream:read	([B)I
    //   58: istore_2
    //   59: iload_2
    //   60: iconst_m1
    //   61: if_icmpeq +20 -> 81
    //   64: aload 7
    //   66: aload 9
    //   68: iconst_0
    //   69: iload_2
    //   70: invokevirtual 522	java/io/OutputStream:write	([BII)V
    //   73: lload_3
    //   74: iload_2
    //   75: i2l
    //   76: ladd
    //   77: lstore_3
    //   78: goto -27 -> 51
    //   81: ldc -106
    //   83: ldc_w 798
    //   86: iconst_2
    //   87: anewarray 4	java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload_0
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: aload_1
    //   97: aastore
    //   98: invokestatic 232	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload 8
    //   103: ifnull +8 -> 111
    //   106: aload 8
    //   108: invokevirtual 590	java/io/InputStream:close	()V
    //   111: lload_3
    //   112: lstore 5
    //   114: aload 7
    //   116: ifnull -89 -> 27
    //   119: aload 7
    //   121: invokevirtual 525	java/io/OutputStream:close	()V
    //   124: lload_3
    //   125: lreturn
    //   126: astore_0
    //   127: lload_3
    //   128: lreturn
    //   129: astore 9
    //   131: aconst_null
    //   132: astore 7
    //   134: aconst_null
    //   135: astore 8
    //   137: ldc -106
    //   139: ldc_w 800
    //   142: iconst_3
    //   143: anewarray 4	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_0
    //   149: aastore
    //   150: dup
    //   151: iconst_1
    //   152: aload_1
    //   153: aastore
    //   154: dup
    //   155: iconst_2
    //   156: aload 9
    //   158: invokevirtual 528	java/io/IOException:getMessage	()Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 348	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload 8
    //   167: ifnull +8 -> 175
    //   170: aload 8
    //   172: invokevirtual 590	java/io/InputStream:close	()V
    //   175: aload 7
    //   177: ifnull +8 -> 185
    //   180: aload 7
    //   182: invokevirtual 525	java/io/OutputStream:close	()V
    //   185: ldc2_w 795
    //   188: lreturn
    //   189: astore_0
    //   190: aconst_null
    //   191: astore 7
    //   193: aconst_null
    //   194: astore 8
    //   196: aload 8
    //   198: ifnull +8 -> 206
    //   201: aload 8
    //   203: invokevirtual 590	java/io/InputStream:close	()V
    //   206: aload 7
    //   208: ifnull +8 -> 216
    //   211: aload 7
    //   213: invokevirtual 525	java/io/OutputStream:close	()V
    //   216: aload_0
    //   217: athrow
    //   218: astore_0
    //   219: goto -108 -> 111
    //   222: astore_0
    //   223: goto -48 -> 175
    //   226: astore_0
    //   227: goto -42 -> 185
    //   230: astore_1
    //   231: goto -25 -> 206
    //   234: astore_1
    //   235: goto -19 -> 216
    //   238: astore_0
    //   239: aconst_null
    //   240: astore 7
    //   242: goto -46 -> 196
    //   245: astore_0
    //   246: goto -50 -> 196
    //   249: astore_0
    //   250: goto -54 -> 196
    //   253: astore 9
    //   255: aconst_null
    //   256: astore 7
    //   258: goto -121 -> 137
    //   261: astore 9
    //   263: goto -126 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	paramString1	String
    //   0	266	1	paramString2	String
    //   58	17	2	i	int
    //   31	97	3	l1	long
    //   25	88	5	l2	long
    //   42	215	7	localOutputStream	OutputStream
    //   36	166	8	localInputStream	InputStream
    //   49	18	9	arrayOfByte	byte[]
    //   129	28	9	localIOException1	IOException
    //   253	1	9	localIOException2	IOException
    //   261	1	9	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   119	124	126	java/io/IOException
    //   32	38	129	java/io/IOException
    //   32	38	189	finally
    //   106	111	218	java/io/IOException
    //   170	175	222	java/io/IOException
    //   180	185	226	java/io/IOException
    //   201	206	230	java/io/IOException
    //   211	216	234	java/io/IOException
    //   38	44	238	finally
    //   44	51	245	finally
    //   51	59	245	finally
    //   64	73	245	finally
    //   81	101	245	finally
    //   137	165	249	finally
    //   38	44	253	java/io/IOException
    //   44	51	261	java/io/IOException
    //   51	59	261	java/io/IOException
    //   64	73	261	java/io/IOException
    //   81	101	261	java/io/IOException
  }
  
  static class SFSContextRec
    implements Parcelable
  {
    public static final Parcelable.Creator<SFSContextRec> CREATOR = new Parcelable.Creator() {};
    String eeG;
    String[] eeH;
    boolean eeI;
    boolean eeJ;
    SFSContext eeK;
    SFSContext.Builder eeL;
    
    public SFSContextRec() {}
    
    SFSContextRec(Parcel paramParcel)
    {
      this.eeG = paramParcel.readString();
      this.eeH = paramParcel.createStringArray();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.eeI = bool;
        this.eeK = null;
        this.eeJ = false;
        this.eeL = ((SFSContext.Builder)paramParcel.readParcelable(SFSContext.Builder.class.getClassLoader()));
        return;
      }
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.eeG);
      paramParcel.writeStringArray(this.eeH);
      if (this.eeI) {}
      for (int i = 1;; i = 0)
      {
        paramParcel.writeByte((byte)i);
        paramParcel.writeParcelable(this.eeL, paramInt);
        return;
      }
    }
  }
  
  final class a
  {
    File[] eeF = null;
    int pos = 0;
    
    a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/FileOp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */