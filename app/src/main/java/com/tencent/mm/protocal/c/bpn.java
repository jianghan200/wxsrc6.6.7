package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bpn
  extends com.tencent.mm.bk.a
{
  public int sij;
  public int snB;
  public LinkedList<bou> snC = new LinkedList();
  public int snD;
  public int snE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.snB);
      paramVarArgs.d(2, 8, this.snC);
      paramVarArgs.fT(3, this.snD);
      paramVarArgs.fT(4, this.sij);
      paramVarArgs.fT(5, this.snE);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.snB) + 0 + f.a.a.a.c(2, 8, this.snC) + f.a.a.a.fQ(3, this.snD) + f.a.a.a.fQ(4, this.sij) + f.a.a.a.fQ(5, this.snE);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.snC.clear();
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
      bpn localbpn = (bpn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbpn.snB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bou();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bou)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbpn.snC.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localbpn.snD = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localbpn.sij = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localbpn.snE = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */