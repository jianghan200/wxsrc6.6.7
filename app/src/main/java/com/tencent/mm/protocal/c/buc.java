package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class buc
  extends com.tencent.mm.bk.a
{
  public bhy rEB;
  public int rfn;
  public int srA;
  public int srv;
  public String sry;
  public String srz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.srv);
      if (this.sry != null) {
        paramVarArgs.g(2, this.sry);
      }
      paramVarArgs.fT(3, this.rfn);
      if (this.srz != null) {
        paramVarArgs.g(4, this.srz);
      }
      if (this.rEB != null)
      {
        paramVarArgs.fV(5, this.rEB.boi());
        this.rEB.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.srA);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.srv) + 0;
      paramInt = i;
      if (this.sry != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sry);
      }
      i = paramInt + f.a.a.a.fQ(3, this.rfn);
      paramInt = i;
      if (this.srz != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.srz);
      }
      i = paramInt;
      if (this.rEB != null) {
        i = paramInt + f.a.a.a.fS(5, this.rEB.boi());
      }
      return i + f.a.a.a.fQ(6, this.srA);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      buc localbuc = (buc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbuc.srv = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localbuc.sry = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localbuc.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localbuc.srz = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbuc.rEB = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localbuc.srA = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/buc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */