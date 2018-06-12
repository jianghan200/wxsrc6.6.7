package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class dl
  extends com.tencent.mm.bk.a
{
  public String jQb;
  public int qZc;
  public int rdH;
  public int rdI;
  public dq rdJ;
  public dk rdK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      paramVarArgs.fT(1, this.qZc);
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      paramVarArgs.fT(3, this.rdH);
      paramVarArgs.fT(4, this.rdI);
      if (this.rdJ != null)
      {
        paramVarArgs.fV(5, this.rdJ.boi());
        this.rdJ.a(paramVarArgs);
      }
      if (this.rdK != null)
      {
        paramVarArgs.fV(6, this.rdK.boi());
        this.rdK.a(paramVarArgs);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.qZc) + 0;
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt + f.a.a.a.fQ(3, this.rdH) + f.a.a.a.fQ(4, this.rdI);
      paramInt = i;
      if (this.rdJ != null) {
        paramInt = i + f.a.a.a.fS(5, this.rdJ.boi());
      }
      i = paramInt;
    } while (this.rdK == null);
    return paramInt + f.a.a.a.fS(6, this.rdK.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      dl localdl = (dl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localdl.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localdl.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localdl.rdH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localdl.rdI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localdl.rdJ = ((dq)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new dk();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((dk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localdl.rdK = ((dk)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */