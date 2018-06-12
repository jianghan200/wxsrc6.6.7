package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class awy
  extends com.tencent.mm.bk.a
{
  public int rZZ;
  public com.tencent.mm.bk.b rgs;
  public String saa;
  public bhy sab;
  public int sac;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sab == null) {
        throw new f.a.a.b("Not all required fields were included: ClientKey");
      }
      paramVarArgs.fT(1, this.rZZ);
      if (this.rgs != null) {
        paramVarArgs.b(2, this.rgs);
      }
      if (this.saa != null) {
        paramVarArgs.g(3, this.saa);
      }
      if (this.sab != null)
      {
        paramVarArgs.fV(4, this.sab.boi());
        this.sab.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.sac);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rZZ) + 0;
      paramInt = i;
      if (this.rgs != null) {
        paramInt = i + f.a.a.a.a(2, this.rgs);
      }
      i = paramInt;
      if (this.saa != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.saa);
      }
      paramInt = i;
      if (this.sab != null) {
        paramInt = i + f.a.a.a.fS(4, this.sab.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.sac);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.sab == null) {
        throw new f.a.a.b("Not all required fields were included: ClientKey");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      awy localawy = (awy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localawy.rZZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localawy.rgs = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      case 3: 
        localawy.saa = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localawy.sab = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localawy.sac = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/awy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */