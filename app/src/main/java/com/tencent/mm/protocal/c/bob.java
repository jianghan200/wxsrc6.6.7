package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bob
  extends com.tencent.mm.bk.a
{
  public int rdq;
  public bhz slT;
  public bhz slV;
  public int slW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.slT != null)
      {
        paramVarArgs.fV(1, this.slT.boi());
        this.slT.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rdq);
      if (this.slV != null)
      {
        paramVarArgs.fV(3, this.slV.boi());
        this.slV.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.slW);
      return 0;
    }
    if (paramInt == 1) {
      if (this.slT == null) {
        break label496;
      }
    }
    label496:
    for (paramInt = f.a.a.a.fS(1, this.slT.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdq);
      paramInt = i;
      if (this.slV != null) {
        paramInt = i + f.a.a.a.fS(3, this.slV.boi());
      }
      return paramInt + f.a.a.a.fQ(4, this.slW);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bob localbob = (bob)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbob.slT = ((bhz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbob.rdq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbob.slV = ((bhz)localObject1);
            paramInt += 1;
          }
        }
        localbob.slW = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */