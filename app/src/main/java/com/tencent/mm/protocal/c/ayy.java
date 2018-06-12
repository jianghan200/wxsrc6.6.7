package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ayy
  extends com.tencent.mm.bk.a
{
  public bhy sbH;
  public int sbI;
  public bhy sbJ;
  public int uin;
  public int version;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.uin);
      paramVarArgs.fT(2, this.version);
      if (this.sbH != null)
      {
        paramVarArgs.fV(3, this.sbH.boi());
        this.sbH.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.sbI);
      if (this.sbJ != null)
      {
        paramVarArgs.fV(5, this.sbJ.boi());
        this.sbJ.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.uin) + 0 + f.a.a.a.fQ(2, this.version);
      paramInt = i;
      if (this.sbH != null) {
        paramInt = i + f.a.a.a.fS(3, this.sbH.boi());
      }
      i = paramInt + f.a.a.a.fQ(4, this.sbI);
      paramInt = i;
    } while (this.sbJ == null);
    return i + f.a.a.a.fS(5, this.sbJ.boi());
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
      ayy localayy = (ayy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localayy.uin = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localayy.version = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localayy.sbH = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localayy.sbI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhy();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localayy.sbJ = ((bhy)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ayy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */