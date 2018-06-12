package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class pb
  extends com.tencent.mm.bk.a
{
  public int rti;
  public int rtj;
  public int rtk;
  public LinkedList<pa> rtl = new LinkedList();
  public b rtm;
  public ami rtn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rti);
      paramVarArgs.fT(2, this.rtj);
      paramVarArgs.fT(3, this.rtk);
      paramVarArgs.d(4, 8, this.rtl);
      if (this.rtm != null) {
        paramVarArgs.b(5, this.rtm);
      }
      if (this.rtn != null)
      {
        paramVarArgs.fV(6, this.rtn.boi());
        this.rtn.a(paramVarArgs);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rti) + 0 + f.a.a.a.fQ(2, this.rtj) + f.a.a.a.fQ(3, this.rtk) + f.a.a.a.c(4, 8, this.rtl);
      paramInt = i;
      if (this.rtm != null) {
        paramInt = i + f.a.a.a.a(5, this.rtm);
      }
      i = paramInt;
    } while (this.rtn == null);
    return paramInt + f.a.a.a.fS(6, this.rtn.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rtl.clear();
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
      pb localpb = (pb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localpb.rti = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localpb.rtj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localpb.rtk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pa();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pa)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localpb.rtl.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localpb.rtm = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ami();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ami)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localpb.rtn = ((ami)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */