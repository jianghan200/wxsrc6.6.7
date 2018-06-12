package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class dx
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jPe;
  public String rei;
  public String rej;
  public dy rek;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rek == null) {
        throw new b("Not all required fields were included: ArtisIcon");
      }
      if (this.jPe != null) {
        paramVarArgs.g(1, this.jPe);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.rei != null) {
        paramVarArgs.g(3, this.rei);
      }
      if (this.rej != null) {
        paramVarArgs.g(4, this.rej);
      }
      if (this.rek != null)
      {
        paramVarArgs.fV(5, this.rek.boi());
        this.rek.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPe == null) {
        break label525;
      }
    }
    label525:
    for (int i = f.a.a.b.b.a.h(1, this.jPe) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.rei != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rei);
      }
      paramInt = i;
      if (this.rej != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rej);
      }
      i = paramInt;
      if (this.rek != null) {
        i = paramInt + f.a.a.a.fS(5, this.rek.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rek != null) {
          break;
        }
        throw new b("Not all required fields were included: ArtisIcon");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        dx localdx = (dx)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localdx.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localdx.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localdx.rei = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localdx.rej = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((dy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localdx.rek = ((dy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */