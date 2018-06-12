package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.q;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.d;
import java.nio.ByteBuffer;

public final class a
  implements com.google.android.exoplayer2.metadata.a
{
  private q alB;
  private final j aoK = new j();
  private final i aqZ = new i();
  
  public final Metadata a(d paramd)
  {
    if ((this.alB == null) || (paramd.aek != this.alB.mp()))
    {
      this.alB = new q(paramd.aih);
      this.alB.U(paramd.aih - paramd.aek);
    }
    paramd = paramd.aig;
    byte[] arrayOfByte = paramd.array();
    int i = paramd.limit();
    this.aoK.m(arrayOfByte, i);
    this.aqZ.m(arrayOfByte, i);
    this.aqZ.cX(39);
    long l = this.aqZ.cY(1);
    l = this.aqZ.cY(32) | l << 32;
    this.aqZ.cX(20);
    i = this.aqZ.cY(12);
    int j = this.aqZ.cY(8);
    this.aoK.da(14);
    switch (j)
    {
    default: 
      paramd = null;
    }
    while (paramd == null)
    {
      return new Metadata(new Metadata.Entry[0]);
      paramd = new SpliceNullCommand();
      continue;
      paramd = SpliceScheduleCommand.c(this.aoK);
      continue;
      paramd = SpliceInsertCommand.a(this.aoK, l, this.alB);
      continue;
      paramd = TimeSignalCommand.b(this.aoK, l, this.alB);
      continue;
      paramd = PrivateCommand.a(this.aoK, i, l);
    }
    return new Metadata(new Metadata.Entry[] { paramd });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */