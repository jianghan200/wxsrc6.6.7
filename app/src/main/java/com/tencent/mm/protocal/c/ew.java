package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ew
  extends com.tencent.mm.bk.a
{
  public String ID;
  public int rfn;
  public bhy rfo;
  public String rfp;
  public int rfq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rfo == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
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
      paramVarArgs.fT(4, this.rfq);
      if (this.ID != null) {
        paramVarArgs.g(5, this.ID);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
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
      i += f.a.a.a.fQ(4, this.rfq);
      paramInt = i;
    } while (this.ID == null);
    return i + f.a.a.b.b.a.h(5, this.ID);
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
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ew localew = (ew)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localew.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localew.rfo = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localew.rfp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localew.rfq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localew.ID = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */