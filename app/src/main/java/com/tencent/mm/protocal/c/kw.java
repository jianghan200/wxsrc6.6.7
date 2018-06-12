package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class kw
  extends com.tencent.mm.bk.a
{
  public String name;
  public String qYo;
  public LinkedList<qj> rmS = new LinkedList();
  public int rmT;
  public String rmU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.rmS);
      if (this.qYo != null) {
        paramVarArgs.g(2, this.qYo);
      }
      paramVarArgs.fT(3, this.rmT);
      if (this.rmU != null) {
        paramVarArgs.g(4, this.rmU);
      }
      if (this.name != null) {
        paramVarArgs.g(5, this.name);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.c(1, 8, this.rmS) + 0;
      paramInt = i;
      if (this.qYo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.qYo);
      }
      i = paramInt + f.a.a.a.fQ(3, this.rmT);
      paramInt = i;
      if (this.rmU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rmU);
      }
      i = paramInt;
    } while (this.name == null);
    return paramInt + f.a.a.b.b.a.h(5, this.name);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rmS.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
      kw localkw = (kw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qj();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((qj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkw.rmS.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localkw.qYo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localkw.rmT = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localkw.rmU = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localkw.name = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/kw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */