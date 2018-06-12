package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class biz
  extends bhd
{
  public int qZc;
  public bhy rcT;
  public bhz rvi;
  public int sdG;
  public int sjk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rvi != null)
      {
        paramVarArgs.fV(2, this.rvi.boi());
        this.rvi.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.qZc);
      if (this.rcT != null)
      {
        paramVarArgs.fV(4, this.rcT.boi());
        this.rcT.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.sdG);
      paramVarArgs.fT(6, this.sjk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label716;
      }
    }
    label716:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rvi != null) {
        i = paramInt + f.a.a.a.fS(2, this.rvi.boi());
      }
      i += f.a.a.a.fQ(3, this.qZc);
      paramInt = i;
      if (this.rcT != null) {
        paramInt = i + f.a.a.a.fS(4, this.rcT.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.sdG) + f.a.a.a.fQ(6, this.sjk);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rvi != null) {
          break;
        }
        throw new b("Not all required fields were included: UserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        biz localbiz = (biz)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbiz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbiz.rvi = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbiz.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbiz.rcT = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbiz.sdG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbiz.sjk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/biz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */