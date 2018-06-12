package com.tencent.tinker.a.a.a;

import com.tencent.tinker.a.a.c;
import com.tencent.tinker.a.a.d;
import com.tencent.tinker.a.a.e;
import com.tencent.tinker.a.a.e.a;
import com.tencent.tinker.a.a.e.b;
import com.tencent.tinker.a.a.f;
import com.tencent.tinker.a.a.g;
import com.tencent.tinker.a.a.g.a;
import com.tencent.tinker.a.a.g.b;
import com.tencent.tinker.a.a.h;
import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.a.k;
import com.tencent.tinker.a.a.m;
import com.tencent.tinker.a.a.n;
import com.tencent.tinker.a.a.o;
import com.tencent.tinker.a.a.p;
import com.tencent.tinker.a.a.q;
import com.tencent.tinker.a.a.r;
import com.tencent.tinker.a.a.s;
import com.tencent.tinker.a.a.u;
import java.io.UTFDataFormatException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a
  implements com.tencent.tinker.a.a.b.a, com.tencent.tinker.a.a.b.b
{
  private static final short[] voP = new short[0];
  private static final g.b[] vpM = new g.b[0];
  private static final g.a[] vpN = new g.a[0];
  public ByteBuffer aig;
  public int vpO;
  private boolean vpP;
  
  public a()
  {
    this.aig = ByteBuffer.allocate(512);
    this.aig.order(ByteOrder.LITTLE_ENDIAN);
    this.vpO = this.aig.position();
    this.aig.limit(this.aig.capacity());
    this.vpP = true;
  }
  
  public a(ByteBuffer paramByteBuffer)
  {
    this.aig = paramByteBuffer;
    this.aig.order(ByteOrder.LITTLE_ENDIAN);
    this.vpO = paramByteBuffer.limit();
    this.vpP = false;
  }
  
  private short[] HA(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = voP;
      return (short[])localObject;
    }
    short[] arrayOfShort = new short[paramInt];
    int i = 0;
    for (;;)
    {
      localObject = arrayOfShort;
      if (i >= paramInt) {
        break;
      }
      arrayOfShort[i] = this.aig.getShort();
      i += 1;
    }
  }
  
  private e.a[] HB(int paramInt)
  {
    e.a[] arrayOfa = new e.a[paramInt];
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      j = o.b(this) + j;
      arrayOfa[i] = new e.a(j, o.b(this));
      i += 1;
    }
    return arrayOfa;
  }
  
  private e.b[] HC(int paramInt)
  {
    e.b[] arrayOfb = new e.b[paramInt];
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      j = o.b(this) + j;
      arrayOfb[i] = new e.b(j, o.b(this), o.b(this));
      i += 1;
    }
    return arrayOfb;
  }
  
  private byte[] HD(int paramInt)
  {
    byte[] arrayOfByte = new byte[this.aig.position() - paramInt];
    this.aig.position(paramInt);
    this.aig.get(arrayOfByte);
    return arrayOfByte;
  }
  
  private void HE(int paramInt)
  {
    int i = (short)paramInt;
    if (paramInt != (0xFFFF & i)) {
      throw new IllegalArgumentException("Expected an unsigned short: " + paramInt);
    }
    writeShort(i);
  }
  
  private void a(e.a[] paramArrayOfa)
  {
    int k = paramArrayOfa.length;
    int i = 0;
    int j = 0;
    while (i < k)
    {
      e.a locala = paramArrayOfa[i];
      o.a(this, locala.voo - j);
      j = locala.voo;
      o.a(this, locala.vop);
      i += 1;
    }
  }
  
  private void a(e.b[] paramArrayOfb)
  {
    int k = paramArrayOfb.length;
    int i = 0;
    int j = 0;
    while (i < k)
    {
      e.b localb = paramArrayOfb[i];
      o.a(this, localb.voq - j);
      j = localb.voq;
      o.a(this, localb.vop);
      o.a(this, localb.vor);
      i += 1;
    }
  }
  
  private int cGN()
  {
    return o.b(this);
  }
  
  private int cGO()
  {
    return o.b(this) - 1;
  }
  
  private int cGP()
  {
    return o.a(this);
  }
  
  private int readUnsignedShort()
  {
    return this.aig.getShort() & 0xFFFF;
  }
  
  private void skip(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException();
    }
    this.aig.position(this.aig.position() + paramInt);
  }
  
  public final void Hy(int paramInt)
  {
    if ((this.aig.position() + paramInt > this.aig.limit()) && (this.vpP))
    {
      byte[] arrayOfByte1 = this.aig.array();
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt + (arrayOfByte1.length >> 1)];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, this.aig.position());
      paramInt = this.aig.position();
      this.aig = ByteBuffer.wrap(arrayOfByte2);
      this.aig.order(ByteOrder.LITTLE_ENDIAN);
      this.aig.position(paramInt);
      this.aig.limit(this.aig.capacity());
    }
  }
  
  public final byte[] Hz(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.aig.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public int a(com.tencent.tinker.a.a.a parama)
  {
    int i = this.aig.position();
    writeByte(parama.voc);
    a(parama.vod);
    return i;
  }
  
  public int a(com.tencent.tinker.a.a.b paramb)
  {
    int j = this.aig.position();
    writeInt(paramb.voe.length);
    paramb = paramb.voe;
    int k = paramb.length;
    int i = 0;
    while (i < k)
    {
      writeInt(paramb[i]);
      i += 1;
    }
    return j;
  }
  
  public int a(c paramc)
  {
    int j = this.aig.position();
    writeInt(paramc.vof.length);
    paramc = paramc.vof;
    int k = paramc.length;
    int i = 0;
    while (i < k)
    {
      writeInt(paramc[i]);
      i += 1;
    }
    return j;
  }
  
  public int a(d paramd)
  {
    int j = this.aig.position();
    writeInt(paramd.vog);
    writeInt(paramd.voh.length);
    writeInt(paramd.voi.length);
    writeInt(paramd.voj.length);
    int[][] arrayOfInt = paramd.voh;
    int k = arrayOfInt.length;
    int i = 0;
    int[] arrayOfInt1;
    while (i < k)
    {
      arrayOfInt1 = arrayOfInt[i];
      writeInt(arrayOfInt1[0]);
      writeInt(arrayOfInt1[1]);
      i += 1;
    }
    arrayOfInt = paramd.voi;
    k = arrayOfInt.length;
    i = 0;
    while (i < k)
    {
      arrayOfInt1 = arrayOfInt[i];
      writeInt(arrayOfInt1[0]);
      writeInt(arrayOfInt1[1]);
      i += 1;
    }
    paramd = paramd.voj;
    k = paramd.length;
    i = 0;
    while (i < k)
    {
      arrayOfInt = paramd[i];
      writeInt(arrayOfInt[0]);
      writeInt(arrayOfInt[1]);
      i += 1;
    }
    return j;
  }
  
  public int a(e parame)
  {
    int i = this.aig.position();
    o.a(this, parame.vok.length);
    o.a(this, parame.vol.length);
    o.a(this, parame.vom.length);
    o.a(this, parame.von.length);
    a(parame.vok);
    a(parame.vol);
    a(parame.vom);
    a(parame.von);
    return i;
  }
  
  public int a(f paramf)
  {
    int i = this.aig.position();
    writeInt(paramf.vos);
    writeInt(paramf.vop);
    writeInt(paramf.vot);
    writeInt(paramf.vou);
    writeInt(paramf.vov);
    writeInt(paramf.vow);
    writeInt(paramf.vox);
    writeInt(paramf.voy);
    return i;
  }
  
  public int a(g paramg)
  {
    int k = 0;
    int m = this.aig.position();
    HE(paramg.voz);
    HE(paramg.voA);
    HE(paramg.voB);
    HE(paramg.voE.length);
    writeInt(paramg.voC);
    writeInt(paramg.voD.length);
    Object localObject1 = paramg.voD;
    Hy(localObject1.length * 2);
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      writeShort(localObject1[i]);
      i += 1;
    }
    if (this.aig.position() > this.vpO) {
      this.vpO = this.aig.position();
    }
    if (paramg.voE.length > 0)
    {
      if ((paramg.voD.length & 0x1) == 1) {
        writeShort((short)0);
      }
      int n = this.aig.position();
      i = paramg.voE.length * 8;
      Hy(i * 1);
      skip(i);
      g.a[] arrayOfa = paramg.voF;
      int i1 = this.aig.position();
      o.a(this, arrayOfa.length);
      localObject1 = new int[arrayOfa.length];
      i = 0;
      while (i < arrayOfa.length)
      {
        localObject1[i] = (this.aig.position() - i1);
        Object localObject2 = arrayOfa[i];
        int i2 = ((g.a)localObject2).voI;
        int[] arrayOfInt = ((g.a)localObject2).voG;
        localObject2 = ((g.a)localObject2).voH;
        if (i2 != -1) {
          o.c(this, -arrayOfInt.length);
        }
        for (;;)
        {
          j = 0;
          while (j < arrayOfInt.length)
          {
            o.a(this, arrayOfInt[j]);
            o.a(this, localObject2[j]);
            j += 1;
          }
          o.c(this, arrayOfInt.length);
        }
        if (i2 != -1) {
          o.a(this, i2);
        }
        i += 1;
      }
      j = this.aig.position();
      this.aig.position(n);
      paramg = paramg.voE;
      n = paramg.length;
      i = k;
      while (i < n)
      {
        arrayOfa = paramg[i];
        writeInt(arrayOfa.voJ);
        HE(arrayOfa.voK);
        HE(localObject1[arrayOfa.voL]);
        i += 1;
      }
      this.aig.position(j);
    }
    return m;
  }
  
  public int a(h paramh)
  {
    int j = this.aig.position();
    o.a(this, paramh.voM);
    int k = paramh.voN.length;
    o.a(this, k);
    int i = 0;
    while (i < k)
    {
      o.a(this, paramh.voN[i] + 1);
      i += 1;
    }
    write(paramh.voO);
    return j;
  }
  
  public int a(k paramk)
  {
    int i = this.aig.position();
    write(paramk.data);
    return i;
  }
  
  public int a(n paramn)
  {
    int i = this.aig.position();
    HE(paramn.vpe);
    HE(paramn.vos);
    writeInt(paramn.vpf);
    return i;
  }
  
  public int a(p paramp)
  {
    int i = this.aig.position();
    HE(paramp.vpe);
    HE(paramp.vpg);
    writeInt(paramp.vpf);
    return i;
  }
  
  public int a(r paramr)
  {
    int i = this.aig.position();
    writeInt(paramr.vph);
    writeInt(paramr.vpi);
    writeInt(paramr.vpj);
    return i;
  }
  
  public int a(s params)
  {
    int i = 0;
    int j = this.aig.position();
    long l;
    for (;;)
    {
      int m;
      try
      {
        o.a(this, params.value.length());
        params = params.value;
        l = 0L;
        int k = params.length();
        if (i >= k) {
          break;
        }
        m = params.charAt(i);
        if ((m != 0) && (m <= 127))
        {
          l += 1L;
          if (l <= 65535L) {
            break label127;
          }
          throw new UTFDataFormatException("String more than 65535 UTF bytes long");
        }
      }
      catch (UTFDataFormatException params)
      {
        throw new AssertionError(params);
      }
      if (m <= 2047)
      {
        l += 2L;
      }
      else
      {
        l += 3L;
        continue;
        label127:
        i += 1;
      }
    }
    i = (int)l;
    byte[] arrayOfByte = new byte[i];
    q.c(arrayOfByte, 0, params);
    write(arrayOfByte);
    writeByte(0);
    return j;
  }
  
  public int a(u paramu)
  {
    int j = this.aig.position();
    paramu = paramu.vpL;
    writeInt(paramu.length);
    int k = paramu.length;
    int i = 0;
    while (i < k)
    {
      writeShort(paramu[i]);
      i += 1;
    }
    return j;
  }
  
  public d cGA()
  {
    int j = this.aig.position();
    int k = this.aig.getInt();
    int i1 = this.aig.getInt();
    int n = this.aig.getInt();
    int m = this.aig.getInt();
    int[][] arrayOfInt1 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 2 });
    int i = 0;
    while (i < i1)
    {
      arrayOfInt1[i][0] = this.aig.getInt();
      arrayOfInt1[i][1] = this.aig.getInt();
      i += 1;
    }
    int[][] arrayOfInt2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { n, 2 });
    i = 0;
    while (i < n)
    {
      arrayOfInt2[i][0] = this.aig.getInt();
      arrayOfInt2[i][1] = this.aig.getInt();
      i += 1;
    }
    int[][] arrayOfInt3 = (int[][])Array.newInstance(Integer.TYPE, new int[] { m, 2 });
    i = 0;
    while (i < m)
    {
      arrayOfInt3[i][0] = this.aig.getInt();
      arrayOfInt3[i][1] = this.aig.getInt();
      i += 1;
    }
    return new d(j, k, arrayOfInt1, arrayOfInt2, arrayOfInt3);
  }
  
  public k cGB()
  {
    int i = this.aig.position();
    new m(this, 28).skipValue();
    return new k(i, HD(i));
  }
  
  public s cGo()
  {
    int j = 0;
    int k = this.aig.position();
    for (;;)
    {
      int i;
      try
      {
        int m = o.b(this);
        Object localObject = new char[m];
        i = (char)(readByte() & 0xFF);
        if (i == 0)
        {
          localObject = new String((char[])localObject, 0, j);
          if (((String)localObject).length() == m) {
            break label259;
          }
          throw new j("Declared length " + m + " doesn't match decoded length of " + ((String)localObject).length());
        }
      }
      catch (UTFDataFormatException localUTFDataFormatException)
      {
        throw new j(localUTFDataFormatException);
      }
      localUTFDataFormatException[j] = i;
      if (i < 128)
      {
        j += 1;
      }
      else
      {
        int n;
        int i1;
        label259:
        s locals;
        if ((i & 0xE0) == 192)
        {
          n = readByte() & 0xFF;
          if ((n & 0xC0) != 128) {
            throw new UTFDataFormatException("bad second byte");
          }
        }
        else
        {
          if ((i & 0xF0) == 224)
          {
            n = readByte() & 0xFF;
            i1 = readByte() & 0xFF;
            if (((n & 0xC0) == 128) && ((i1 & 0xC0) == 128)) {
              break label299;
            }
            throw new UTFDataFormatException("bad second or third byte");
          }
          throw new UTFDataFormatException("bad byte");
          locals = new s(k, localUTFDataFormatException);
          return locals;
        }
        locals[j] = ((char)((i & 0x1F) << 6 | n & 0x3F));
        j += 1;
        continue;
        label299:
        locals[j] = ((char)((i & 0xF) << 12 | (n & 0x3F) << 6 | i1 & 0x3F));
        j += 1;
      }
    }
  }
  
  public u cGp()
  {
    return new u(this.aig.position(), HA(this.aig.getInt()));
  }
  
  public n cGq()
  {
    return new n(this.aig.position(), readUnsignedShort(), readUnsignedShort(), this.aig.getInt());
  }
  
  public p cGr()
  {
    return new p(this.aig.position(), readUnsignedShort(), readUnsignedShort(), this.aig.getInt());
  }
  
  public r cGs()
  {
    return new r(this.aig.position(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt());
  }
  
  public f cGt()
  {
    return new f(this.aig.position(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt(), this.aig.getInt());
  }
  
  public g cGu()
  {
    int k = this.aig.position();
    int m = readUnsignedShort();
    int n = readUnsignedShort();
    int i1 = readUnsignedShort();
    int i2 = readUnsignedShort();
    int i3 = this.aig.getInt();
    short[] arrayOfShort = HA(this.aig.getInt());
    g.a[] arrayOfa;
    Object localObject;
    if (i2 > 0)
    {
      if ((arrayOfShort.length & 0x1) == 1) {
        skip(2);
      }
      int i4 = this.aig.position();
      skip(i2 * 8);
      int i5 = this.aig.position();
      int i6 = o.b(this);
      arrayOfa = new g.a[i6];
      int i = 0;
      int i7;
      int j;
      if (i < i6)
      {
        i7 = this.aig.position();
        int i8 = o.a(this);
        int i9 = Math.abs(i8);
        localObject = new int[i9];
        int[] arrayOfInt = new int[i9];
        j = 0;
        while (j < i9)
        {
          localObject[j] = o.b(this);
          arrayOfInt[j] = o.b(this);
          j += 1;
        }
        if (i8 <= 0) {}
        for (j = o.b(this);; j = -1)
        {
          arrayOfa[i] = new g.a((int[])localObject, arrayOfInt, j, i7 - i5);
          i += 1;
          break;
        }
      }
      i5 = this.aig.position();
      this.aig.position(i4);
      localObject = new g.b[i2];
      i = 0;
      if (i < i2)
      {
        i4 = this.aig.getInt();
        i6 = readUnsignedShort();
        i7 = readUnsignedShort();
        j = 0;
        for (;;)
        {
          if (j >= arrayOfa.length) {
            break label335;
          }
          if (arrayOfa[j].offset == i7)
          {
            localObject[i] = new g.b(i4, i6, j);
            i += 1;
            break;
          }
          j += 1;
        }
        label335:
        throw new IllegalArgumentException();
      }
      this.aig.position(i5);
    }
    for (;;)
    {
      return new g(k, m, n, i1, i3, arrayOfShort, (g.b[])localObject, arrayOfa);
      localObject = vpM;
      arrayOfa = vpN;
    }
  }
  
  /* Error */
  public h cGv()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	com/tencent/tinker/a/a/a/a:aig	Ljava/nio/ByteBuffer;
    //   4: invokevirtual 58	java/nio/ByteBuffer:position	()I
    //   7: istore_2
    //   8: aload_0
    //   9: invokestatic 88	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/a;)I
    //   12: istore_3
    //   13: aload_0
    //   14: invokestatic 88	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/a;)I
    //   17: istore 4
    //   19: iload 4
    //   21: newarray <illegal type>
    //   23: astore 5
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: iload 4
    //   30: if_icmpge +20 -> 50
    //   33: aload 5
    //   35: iload_1
    //   36: aload_0
    //   37: invokestatic 88	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/a;)I
    //   40: iconst_1
    //   41: isub
    //   42: iastore
    //   43: iload_1
    //   44: iconst_1
    //   45: iadd
    //   46: istore_1
    //   47: goto -20 -> 27
    //   50: new 530	java/io/ByteArrayOutputStream
    //   53: dup
    //   54: bipush 64
    //   56: invokespecial 532	java/io/ByteArrayOutputStream:<init>	(I)V
    //   59: astore 6
    //   61: new 534	com/tencent/tinker/a/a/a/a$1
    //   64: dup
    //   65: aload_0
    //   66: aload 6
    //   68: invokespecial 537	com/tencent/tinker/a/a/a/a$1:<init>	(Lcom/tencent/tinker/a/a/a/a;Ljava/io/ByteArrayOutputStream;)V
    //   71: astore 7
    //   73: aload_0
    //   74: getfield 44	com/tencent/tinker/a/a/a/a:aig	Ljava/nio/ByteBuffer;
    //   77: invokevirtual 539	java/nio/ByteBuffer:get	()B
    //   80: istore_1
    //   81: aload 6
    //   83: iload_1
    //   84: invokevirtual 541	java/io/ByteArrayOutputStream:write	(I)V
    //   87: iload_1
    //   88: tableswitch	default:+215->303, 0:+56->144, 1:+82->170, 2:+110->198, 3:+123->211, 4:+123->211, 5:+171->259, 6:+171->259, 7:+215->303, 8:+215->303, 9:+184->272
    //   144: new 322	com/tencent/tinker/a/a/h
    //   147: dup
    //   148: iload_2
    //   149: iload_3
    //   150: aload 5
    //   152: aload 6
    //   154: invokevirtual 544	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   157: invokespecial 547	com/tencent/tinker/a/a/h:<init>	(II[I[B)V
    //   160: astore 5
    //   162: aload 6
    //   164: invokevirtual 550	java/io/ByteArrayOutputStream:close	()V
    //   167: aload 5
    //   169: areturn
    //   170: aload 7
    //   172: aload_0
    //   173: invokespecial 552	com/tencent/tinker/a/a/a/a:cGN	()I
    //   176: invokestatic 139	com/tencent/tinker/a/a/o:a	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   179: pop
    //   180: goto -107 -> 73
    //   183: astore 5
    //   185: aload 6
    //   187: ifnull +8 -> 195
    //   190: aload 6
    //   192: invokevirtual 550	java/io/ByteArrayOutputStream:close	()V
    //   195: aload 5
    //   197: athrow
    //   198: aload 7
    //   200: aload_0
    //   201: invokespecial 554	com/tencent/tinker/a/a/a/a:cGP	()I
    //   204: invokestatic 310	com/tencent/tinker/a/a/o:c	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   207: pop
    //   208: goto -135 -> 73
    //   211: aload 7
    //   213: aload_0
    //   214: invokespecial 552	com/tencent/tinker/a/a/a/a:cGN	()I
    //   217: invokestatic 139	com/tencent/tinker/a/a/o:a	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   220: pop
    //   221: aload 7
    //   223: aload_0
    //   224: invokespecial 556	com/tencent/tinker/a/a/a/a:cGO	()I
    //   227: invokestatic 558	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   230: pop
    //   231: aload 7
    //   233: aload_0
    //   234: invokespecial 556	com/tencent/tinker/a/a/a/a:cGO	()I
    //   237: invokestatic 558	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   240: pop
    //   241: iload_1
    //   242: iconst_4
    //   243: if_icmpne -170 -> 73
    //   246: aload 7
    //   248: aload_0
    //   249: invokespecial 556	com/tencent/tinker/a/a/a/a:cGO	()I
    //   252: invokestatic 558	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   255: pop
    //   256: goto -183 -> 73
    //   259: aload 7
    //   261: aload_0
    //   262: invokespecial 552	com/tencent/tinker/a/a/a/a:cGN	()I
    //   265: invokestatic 139	com/tencent/tinker/a/a/o:a	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   268: pop
    //   269: goto -196 -> 73
    //   272: aload 7
    //   274: aload_0
    //   275: invokespecial 556	com/tencent/tinker/a/a/a/a:cGO	()I
    //   278: invokestatic 558	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   281: pop
    //   282: goto -209 -> 73
    //   285: astore 6
    //   287: aload 5
    //   289: areturn
    //   290: astore 6
    //   292: goto -97 -> 195
    //   295: astore 5
    //   297: aconst_null
    //   298: astore 6
    //   300: goto -115 -> 185
    //   303: goto -230 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	this	a
    //   26	218	1	i	int
    //   7	142	2	j	int
    //   12	138	3	k	int
    //   17	14	4	m	int
    //   23	145	5	localObject1	Object
    //   183	105	5	localh	h
    //   295	1	5	localObject2	Object
    //   59	132	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   285	1	6	localException1	Exception
    //   290	1	6	localException2	Exception
    //   298	1	6	localObject3	Object
    //   71	202	7	local1	a.1
    // Exception table:
    //   from	to	target	type
    //   61	73	183	finally
    //   73	87	183	finally
    //   144	162	183	finally
    //   170	180	183	finally
    //   198	208	183	finally
    //   211	241	183	finally
    //   246	256	183	finally
    //   259	269	183	finally
    //   272	282	183	finally
    //   162	167	285	java/lang/Exception
    //   190	195	290	java/lang/Exception
    //   50	61	295	finally
  }
  
  public e cGw()
  {
    int i = this.aig.position();
    int j = o.b(this);
    int k = o.b(this);
    int m = o.b(this);
    int n = o.b(this);
    return new e(i, HB(j), HB(k), HC(m), HC(n));
  }
  
  public com.tencent.tinker.a.a.a cGx()
  {
    int i = this.aig.position();
    byte b = this.aig.get();
    int j = this.aig.position();
    new m(this, 29).skipValue();
    return new com.tencent.tinker.a.a.a(i, b, new k(j, HD(j)));
  }
  
  public com.tencent.tinker.a.a.b cGy()
  {
    int j = this.aig.position();
    int k = this.aig.getInt();
    int[] arrayOfInt = new int[k];
    int i = 0;
    while (i < k)
    {
      arrayOfInt[i] = this.aig.getInt();
      i += 1;
    }
    return new com.tencent.tinker.a.a.b(j, arrayOfInt);
  }
  
  public c cGz()
  {
    int j = this.aig.position();
    int k = this.aig.getInt();
    int[] arrayOfInt = new int[k];
    int i = 0;
    while (i < k)
    {
      arrayOfInt[i] = this.aig.getInt();
      i += 1;
    }
    return new c(j, arrayOfInt);
  }
  
  public final byte readByte()
  {
    return this.aig.get();
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    Hy(paramArrayOfByte.length * 1);
    this.aig.put(paramArrayOfByte);
    if (this.aig.position() > this.vpO) {
      this.vpO = this.aig.position();
    }
  }
  
  public final void writeByte(int paramInt)
  {
    Hy(1);
    this.aig.put((byte)paramInt);
    if (this.aig.position() > this.vpO) {
      this.vpO = this.aig.position();
    }
  }
  
  public final void writeInt(int paramInt)
  {
    Hy(4);
    this.aig.putInt(paramInt);
    if (this.aig.position() > this.vpO) {
      this.vpO = this.aig.position();
    }
  }
  
  public final void writeShort(short paramShort)
  {
    Hy(2);
    this.aig.putShort(paramShort);
    if (this.aig.position() > this.vpO) {
      this.vpO = this.aig.position();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tinker/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */