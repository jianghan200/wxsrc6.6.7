package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ayn
  extends bhp
{
  public int hUm;
  public String hUn;
  public String hUy;
  public String hUz;
  public int sbr;
  public int sbs;
  public String sbt;
  
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
      paramVarArgs.fT(2, this.hUm);
      if (this.hUn != null) {
        paramVarArgs.g(3, this.hUn);
      }
      paramVarArgs.fT(4, this.sbr);
      paramVarArgs.fT(5, this.sbs);
      if (this.hUy != null) {
        paramVarArgs.g(6, this.hUy);
      }
      if (this.hUz != null) {
        paramVarArgs.g(7, this.hUz);
      }
      if (this.sbt != null) {
        paramVarArgs.g(8, this.sbt);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label646;
      }
    }
    label646:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt + f.a.a.a.fQ(4, this.sbr) + f.a.a.a.fQ(5, this.sbs);
      paramInt = i;
      if (this.hUy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.hUy);
      }
      i = paramInt;
      if (this.hUz != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.hUz);
      }
      paramInt = i;
      if (this.sbt != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.sbt);
      }
      return paramInt;
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
        ayn localayn = (ayn)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localayn.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localayn.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localayn.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localayn.sbr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localayn.sbs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localayn.hUy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localayn.hUz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localayn.sbt = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ayn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */