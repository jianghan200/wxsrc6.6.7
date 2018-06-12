package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.d;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
  implements com.google.android.exoplayer2.metadata.a
{
  public final Metadata a(d paramd)
  {
    Object localObject = paramd.aig;
    paramd = ((ByteBuffer)localObject).array();
    int i = ((ByteBuffer)localObject).limit();
    localObject = new j(paramd, i);
    String str1 = ((j)localObject).mj();
    String str2 = ((j)localObject).mj();
    long l = ((j)localObject).ba();
    ((j)localObject).da(4);
    return new Metadata(new Metadata.Entry[] { new EventMessage(str1, str2, ((j)localObject).ba() * 1000L / l, ((j)localObject).ba(), Arrays.copyOfRange(paramd, ((j)localObject).position, i)) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/metadata/emsg/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */