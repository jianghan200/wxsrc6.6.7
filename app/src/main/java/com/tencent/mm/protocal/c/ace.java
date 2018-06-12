package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class ace
  extends com.tencent.mm.bk.a
{
  public int rGN;
  public int rGO;
  public int rGP;
  public int rti;
  public int rtj;
  public int rtk;
  public b rtm;
  public ami rtn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rti);
      paramVarArgs.fT(2, this.rtj);
      paramVarArgs.fT(3, this.rtk);
      if (this.rtm != null) {
        paramVarArgs.b(4, this.rtm);
      }
      paramVarArgs.fT(5, this.rGN);
      paramVarArgs.fT(6, this.rGO);
      paramVarArgs.fT(7, this.rGP);
      if (this.rtn != null)
      {
        paramVarArgs.fV(8, this.rtn.boi());
        this.rtn.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.rti) + 0 + f.a.a.a.fQ(2, this.rtj) + f.a.a.a.fQ(3, this.rtk);
      paramInt = i;
      if (this.rtm != null) {
        paramInt = i + f.a.a.a.a(4, this.rtm);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rGN) + f.a.a.a.fQ(6, this.rGO) + f.a.a.a.fQ(7, this.rGP);
      paramInt = i;
    } while (this.rtn == null);
    return i + f.a.a.a.fS(8, this.rtn.boi());
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
      ace localace = (ace)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localace.rti = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localace.rtj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localace.rtk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localace.rtm = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      case 5: 
        localace.rGN = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localace.rGO = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localace.rGP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ami();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ami)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localace.rtn = ((ami)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */