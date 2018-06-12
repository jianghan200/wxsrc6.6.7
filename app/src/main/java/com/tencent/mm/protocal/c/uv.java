package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class uv
  extends bhp
{
  public uy ryf;
  public us ryg;
  public ut ryh;
  public String ryi;
  public int ryj;
  public int ryk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.ryf != null)
      {
        paramVarArgs.fV(2, this.ryf.boi());
        this.ryf.a(paramVarArgs);
      }
      if (this.ryg != null)
      {
        paramVarArgs.fV(3, this.ryg.boi());
        this.ryg.a(paramVarArgs);
      }
      if (this.ryh != null)
      {
        paramVarArgs.fV(4, this.ryh.boi());
        this.ryh.a(paramVarArgs);
      }
      if (this.ryi != null) {
        paramVarArgs.g(5, this.ryi);
      }
      paramVarArgs.fT(6, this.ryj);
      paramVarArgs.fT(7, this.ryk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label881;
      }
    }
    label881:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ryf != null) {
        paramInt = i + f.a.a.a.fS(2, this.ryf.boi());
      }
      i = paramInt;
      if (this.ryg != null) {
        i = paramInt + f.a.a.a.fS(3, this.ryg.boi());
      }
      paramInt = i;
      if (this.ryh != null) {
        paramInt = i + f.a.a.a.fS(4, this.ryh.boi());
      }
      i = paramInt;
      if (this.ryi != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.ryi);
      }
      return i + f.a.a.a.fQ(6, this.ryj) + f.a.a.a.fQ(7, this.ryk);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        uv localuv = (uv)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localuv.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new uy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localuv.ryf = ((uy)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new us();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((us)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localuv.ryg = ((us)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ut();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ut)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localuv.ryh = ((ut)localObject1);
            paramInt += 1;
          }
        case 5: 
          localuv.ryi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localuv.ryj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localuv.ryk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/uv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */