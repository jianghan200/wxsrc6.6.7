package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class ShareElfFile
  implements Closeable
{
  private final FileInputStream vuH;
  private final Map<String, SectionHeader> vuI = new HashMap();
  public ElfHeader vuJ = null;
  public ProgramHeader[] vuK = null;
  public SectionHeader[] vuL = null;
  
  public ShareElfFile(File paramFile)
  {
    this.vuH = new FileInputStream(paramFile);
    Object localObject = this.vuH.getChannel();
    this.vuJ = new ElfHeader((FileChannel)localObject, (byte)0);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(128);
    localByteBuffer.limit(this.vuJ.vuV);
    if (this.vuJ.vuM[5] == 1) {}
    for (paramFile = ByteOrder.LITTLE_ENDIAN;; paramFile = ByteOrder.BIG_ENDIAN)
    {
      localByteBuffer.order(paramFile);
      ((FileChannel)localObject).position(this.vuJ.vuR);
      this.vuK = new ProgramHeader[this.vuJ.vuW];
      i = 0;
      while (i < this.vuK.length)
      {
        a((FileChannel)localObject, localByteBuffer, "failed to read phdr.");
        this.vuK[i] = new ProgramHeader(localByteBuffer, this.vuJ.vuM[4], 0);
        i += 1;
      }
    }
    ((FileChannel)localObject).position(this.vuJ.vuS);
    localByteBuffer.limit(this.vuJ.vuX);
    this.vuL = new SectionHeader[this.vuJ.vuY];
    int i = 0;
    while (i < this.vuL.length)
    {
      a((FileChannel)localObject, localByteBuffer, "failed to read shdr.");
      this.vuL[i] = new SectionHeader(localByteBuffer, this.vuJ.vuM[4], 0);
      i += 1;
    }
    if (this.vuJ.vuZ > 0)
    {
      localObject = this.vuL[this.vuJ.vuZ];
      paramFile = ByteBuffer.allocate((int)((SectionHeader)localObject).vvn);
      this.vuH.getChannel().position(((SectionHeader)localObject).vvm);
      a(this.vuH.getChannel(), paramFile, "failed to read section: " + ((SectionHeader)localObject).vvs);
      localObject = this.vuL;
      int k = localObject.length;
      i = j;
      while (i < k)
      {
        localByteBuffer = localObject[i];
        paramFile.position(localByteBuffer.vvi);
        localByteBuffer.vvs = y(paramFile);
        this.vuI.put(localByteBuffer.vvs, localByteBuffer);
        i += 1;
      }
    }
  }
  
  public static void a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, String paramString)
  {
    paramByteBuffer.rewind();
    int i = paramFileChannel.read(paramByteBuffer);
    if (i != paramByteBuffer.limit()) {
      throw new IOException(paramString + " Rest bytes insufficient, expect to read " + paramByteBuffer.limit() + " bytes but only " + i + " bytes were read.");
    }
    paramByteBuffer.flip();
  }
  
  /* Error */
  public static int af(File paramFile)
  {
    // Byte code:
    //   0: iconst_4
    //   1: newarray <illegal type>
    //   3: astore_3
    //   4: new 46	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   12: astore_2
    //   13: aload_2
    //   14: aload_3
    //   15: invokevirtual 203	java/io/InputStream:read	([B)I
    //   18: pop
    //   19: aload_3
    //   20: iconst_0
    //   21: baload
    //   22: bipush 100
    //   24: if_icmpne +35 -> 59
    //   27: aload_3
    //   28: iconst_1
    //   29: baload
    //   30: bipush 101
    //   32: if_icmpne +27 -> 59
    //   35: aload_3
    //   36: iconst_2
    //   37: baload
    //   38: bipush 121
    //   40: if_icmpne +19 -> 59
    //   43: aload_3
    //   44: iconst_3
    //   45: baload
    //   46: istore_1
    //   47: iload_1
    //   48: bipush 10
    //   50: if_icmpne +9 -> 59
    //   53: aload_2
    //   54: invokevirtual 206	java/io/InputStream:close	()V
    //   57: iconst_0
    //   58: ireturn
    //   59: aload_3
    //   60: iconst_0
    //   61: baload
    //   62: bipush 127
    //   64: if_icmpne +33 -> 97
    //   67: aload_3
    //   68: iconst_1
    //   69: baload
    //   70: bipush 69
    //   72: if_icmpne +25 -> 97
    //   75: aload_3
    //   76: iconst_2
    //   77: baload
    //   78: bipush 76
    //   80: if_icmpne +17 -> 97
    //   83: aload_3
    //   84: iconst_3
    //   85: baload
    //   86: bipush 70
    //   88: if_icmpne +9 -> 97
    //   91: aload_2
    //   92: invokevirtual 206	java/io/InputStream:close	()V
    //   95: iconst_1
    //   96: ireturn
    //   97: aload_2
    //   98: invokevirtual 206	java/io/InputStream:close	()V
    //   101: iconst_m1
    //   102: ireturn
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_2
    //   106: aload_2
    //   107: ifnull +7 -> 114
    //   110: aload_2
    //   111: invokevirtual 206	java/io/InputStream:close	()V
    //   114: aload_0
    //   115: athrow
    //   116: astore_0
    //   117: iconst_0
    //   118: ireturn
    //   119: astore_0
    //   120: goto -25 -> 95
    //   123: astore_0
    //   124: goto -23 -> 101
    //   127: astore_2
    //   128: goto -14 -> 114
    //   131: astore_0
    //   132: goto -26 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramFile	File
    //   46	5	1	i	int
    //   12	99	2	localFileInputStream	FileInputStream
    //   127	1	2	localThrowable	Throwable
    //   3	81	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	13	103	finally
    //   53	57	116	java/lang/Throwable
    //   91	95	119	java/lang/Throwable
    //   97	101	123	java/lang/Throwable
    //   110	114	127	java/lang/Throwable
    //   13	19	131	finally
  }
  
  private static String y(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = paramByteBuffer.array();
    int i = paramByteBuffer.position();
    while ((paramByteBuffer.hasRemaining()) && (arrayOfByte[paramByteBuffer.position()] != 0)) {
      paramByteBuffer.position(paramByteBuffer.position() + 1);
    }
    paramByteBuffer.position(paramByteBuffer.position() + 1);
    return new String(arrayOfByte, i, paramByteBuffer.position() - i - 1, Charset.forName("ASCII"));
  }
  
  public void close()
  {
    this.vuH.close();
    this.vuI.clear();
    this.vuK = null;
    this.vuL = null;
  }
  
  public static class ElfHeader
  {
    public final byte[] vuM = new byte[16];
    public final short vuN;
    public final short vuO;
    public final int vuP;
    public final long vuQ;
    public final long vuR;
    public final long vuS;
    public final int vuT;
    public final short vuU;
    public final short vuV;
    public final short vuW;
    public final short vuX;
    public final short vuY;
    public final short vuZ;
    
    private ElfHeader(FileChannel paramFileChannel)
    {
      paramFileChannel.position(0L);
      paramFileChannel.read(ByteBuffer.wrap(this.vuM));
      if ((this.vuM[0] != Byte.MAX_VALUE) || (this.vuM[1] != 69) || (this.vuM[2] != 76) || (this.vuM[3] != 70)) {
        throw new IOException(String.format("bad elf magic: %x %x %x %x.", new Object[] { Byte.valueOf(this.vuM[0]), Byte.valueOf(this.vuM[1]), Byte.valueOf(this.vuM[2]), Byte.valueOf(this.vuM[3]) }));
      }
      ShareElfFile.v(this.vuM[4], 2, "bad elf class: " + this.vuM[4]);
      ShareElfFile.v(this.vuM[5], 2, "bad elf data encoding: " + this.vuM[5]);
      int i;
      label214:
      ByteBuffer localByteBuffer;
      if (this.vuM[4] == 1)
      {
        i = 36;
        localByteBuffer = ByteBuffer.allocate(i);
        if (this.vuM[5] != 1) {
          break label367;
        }
      }
      label367:
      for (ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;; localByteOrder = ByteOrder.BIG_ENDIAN)
      {
        localByteBuffer.order(localByteOrder);
        ShareElfFile.a(paramFileChannel, localByteBuffer, "failed to read rest part of ehdr.");
        this.vuN = localByteBuffer.getShort();
        this.vuO = localByteBuffer.getShort();
        this.vuP = localByteBuffer.getInt();
        ShareElfFile.v(this.vuP, 1, "bad elf version: " + this.vuP);
        switch (this.vuM[4])
        {
        default: 
          throw new IOException("Unexpected elf class: " + this.vuM[4]);
          i = 48;
          break label214;
        }
      }
      this.vuQ = localByteBuffer.getInt();
      this.vuR = localByteBuffer.getInt();
      for (this.vuS = localByteBuffer.getInt();; this.vuS = localByteBuffer.getLong())
      {
        this.vuT = localByteBuffer.getInt();
        this.vuU = localByteBuffer.getShort();
        this.vuV = localByteBuffer.getShort();
        this.vuW = localByteBuffer.getShort();
        this.vuX = localByteBuffer.getShort();
        this.vuY = localByteBuffer.getShort();
        this.vuZ = localByteBuffer.getShort();
        return;
        this.vuQ = localByteBuffer.getLong();
        this.vuR = localByteBuffer.getLong();
      }
    }
  }
  
  public static class ProgramHeader
  {
    public final int vva;
    public final int vvb;
    public final long vvc;
    public final long vvd;
    public final long vve;
    public final long vvf;
    public final long vvg;
    public final long vvh;
    
    private ProgramHeader(ByteBuffer paramByteBuffer, int paramInt)
    {
      switch (paramInt)
      {
      default: 
        throw new IOException("Unexpected elf class: " + paramInt);
      case 1: 
        this.vva = paramByteBuffer.getInt();
        this.vvc = paramByteBuffer.getInt();
        this.vvd = paramByteBuffer.getInt();
        this.vve = paramByteBuffer.getInt();
        this.vvf = paramByteBuffer.getInt();
        this.vvg = paramByteBuffer.getInt();
        this.vvb = paramByteBuffer.getInt();
        this.vvh = paramByteBuffer.getInt();
        return;
      }
      this.vva = paramByteBuffer.getInt();
      this.vvb = paramByteBuffer.getInt();
      this.vvc = paramByteBuffer.getLong();
      this.vvd = paramByteBuffer.getLong();
      this.vve = paramByteBuffer.getLong();
      this.vvf = paramByteBuffer.getLong();
      this.vvg = paramByteBuffer.getLong();
      this.vvh = paramByteBuffer.getLong();
    }
  }
  
  public static class SectionHeader
  {
    public final int vvi;
    public final int vvj;
    public final long vvk;
    public final long vvl;
    public final long vvm;
    public final long vvn;
    public final int vvo;
    public final int vvp;
    public final long vvq;
    public final long vvr;
    public String vvs;
    
    private SectionHeader(ByteBuffer paramByteBuffer, int paramInt)
    {
      switch (paramInt)
      {
      default: 
        throw new IOException("Unexpected elf class: " + paramInt);
      case 1: 
        this.vvi = paramByteBuffer.getInt();
        this.vvj = paramByteBuffer.getInt();
        this.vvk = paramByteBuffer.getInt();
        this.vvl = paramByteBuffer.getInt();
        this.vvm = paramByteBuffer.getInt();
        this.vvn = paramByteBuffer.getInt();
        this.vvo = paramByteBuffer.getInt();
        this.vvp = paramByteBuffer.getInt();
        this.vvq = paramByteBuffer.getInt();
      }
      for (this.vvr = paramByteBuffer.getInt();; this.vvr = paramByteBuffer.getLong())
      {
        this.vvs = null;
        return;
        this.vvi = paramByteBuffer.getInt();
        this.vvj = paramByteBuffer.getInt();
        this.vvk = paramByteBuffer.getLong();
        this.vvl = paramByteBuffer.getLong();
        this.vvm = paramByteBuffer.getLong();
        this.vvn = paramByteBuffer.getLong();
        this.vvo = paramByteBuffer.getInt();
        this.vvp = paramByteBuffer.getInt();
        this.vvq = paramByteBuffer.getLong();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/shareutil/ShareElfFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */