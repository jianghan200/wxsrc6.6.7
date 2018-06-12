package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ex
  extends com.tencent.mm.bk.a
  implements bnu
{
  public String ID;
  public bhy reV;
  public String rfm;
  public int rfn;
  public bhy rfo;
  public String rfp;
  public int rfq;
  public String rfr;
  public String rfs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rfo == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      if (this.reV == null) {
        throw new b("Not all required fields were included: Key");
      }
      paramVarArgs.fT(1, this.rfn);
      if (this.rfo != null)
      {
        paramVarArgs.fV(2, this.rfo.boi());
        this.rfo.a(paramVarArgs);
      }
      if (this.rfp != null) {
        paramVarArgs.g(3, this.rfp);
      }
      if (this.reV != null)
      {
        paramVarArgs.fV(4, this.reV.boi());
        this.reV.a(paramVarArgs);
      }
      if (this.rfr != null) {
        paramVarArgs.g(5, this.rfr);
      }
      if (this.rfs != null) {
        paramVarArgs.g(6, this.rfs);
      }
      paramVarArgs.fT(7, this.rfq);
      if (this.ID != null) {
        paramVarArgs.g(8, this.ID);
      }
      if (this.rfm != null) {
        paramVarArgs.g(9, this.rfm);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rfn) + 0;
      paramInt = i;
      if (this.rfo != null) {
        paramInt = i + f.a.a.a.fS(2, this.rfo.boi());
      }
      i = paramInt;
      if (this.rfp != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rfp);
      }
      paramInt = i;
      if (this.reV != null) {
        paramInt = i + f.a.a.a.fS(4, this.reV.boi());
      }
      i = paramInt;
      if (this.rfr != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rfr);
      }
      paramInt = i;
      if (this.rfs != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rfs);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rfq);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.ID);
      }
      i = paramInt;
    } while (this.rfm == null);
    return paramInt + f.a.a.b.b.a.h(9, this.rfm);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rfo == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      if (this.reV == null) {
        throw new b("Not all required fields were included: Key");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ex localex = (ex)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localex.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localex.rfo = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localex.rfp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localex.reV = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localex.rfr = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localex.rfs = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        localex.rfq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localex.ID = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localex.rfm = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
  
  public final int getRet()
  {
    return this.rfn;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */