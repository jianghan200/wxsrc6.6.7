package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bnx
  extends com.tencent.mm.bk.a
{
  public int lOS;
  public cf rII;
  public String rmM;
  public LinkedList<bbs> slP = new LinkedList();
  public um slQ;
  public LinkedList<bfm> slR = new LinkedList();
  public int slS;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.lOS);
      paramVarArgs.d(2, 8, this.slP);
      if (this.slQ != null)
      {
        paramVarArgs.fV(3, this.slQ.boi());
        this.slQ.a(paramVarArgs);
      }
      if (this.rII != null)
      {
        paramVarArgs.fV(4, this.rII.boi());
        this.rII.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.slR);
      paramVarArgs.fT(6, this.slS);
      if (this.rmM != null) {
        paramVarArgs.g(7, this.rmM);
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
      i = f.a.a.a.fQ(1, this.lOS) + 0 + f.a.a.a.c(2, 8, this.slP);
      paramInt = i;
      if (this.slQ != null) {
        paramInt = i + f.a.a.a.fS(3, this.slQ.boi());
      }
      i = paramInt;
      if (this.rII != null) {
        i = paramInt + f.a.a.a.fS(4, this.rII.boi());
      }
      i = i + f.a.a.a.c(5, 8, this.slR) + f.a.a.a.fQ(6, this.slS);
      paramInt = i;
    } while (this.rmM == null);
    return i + f.a.a.b.b.a.h(7, this.rmM);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.slP.clear();
      this.slR.clear();
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
      bnx localbnx = (bnx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbnx.lOS = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbnx.slP.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new um();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((um)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbnx.slQ = ((um)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cf();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbnx.rII = ((cf)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfm();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbnx.slR.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localbnx.slS = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localbnx.rmM = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */