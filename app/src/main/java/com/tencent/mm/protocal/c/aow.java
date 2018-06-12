package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aow
  extends bhp
{
  public String eJK;
  public String qZf;
  public String qZs;
  public aof rRd;
  public String rRf;
  public String rRg;
  public String rRh;
  public int rRi;
  
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
      if (this.rRd != null)
      {
        paramVarArgs.fV(2, this.rRd.boi());
        this.rRd.a(paramVarArgs);
      }
      if (this.rRg != null) {
        paramVarArgs.g(3, this.rRg);
      }
      if (this.qZs != null) {
        paramVarArgs.g(4, this.qZs);
      }
      if (this.qZf != null) {
        paramVarArgs.g(5, this.qZf);
      }
      if (this.rRh != null) {
        paramVarArgs.g(6, this.rRh);
      }
      paramVarArgs.fT(7, this.rRi);
      if (this.rRf != null) {
        paramVarArgs.g(8, this.rRf);
      }
      if (this.eJK != null) {
        paramVarArgs.g(9, this.eJK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label831;
      }
    }
    label831:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rRd != null) {
        paramInt = i + f.a.a.a.fS(2, this.rRd.boi());
      }
      i = paramInt;
      if (this.rRg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rRg);
      }
      paramInt = i;
      if (this.qZs != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.qZs);
      }
      i = paramInt;
      if (this.qZf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.qZf);
      }
      paramInt = i;
      if (this.rRh != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rRh);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rRi);
      paramInt = i;
      if (this.rRf != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rRf);
      }
      i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.eJK);
      }
      return i;
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
        aow localaow = (aow)paramVarArgs[1];
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
            localaow.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aof();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aof)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaow.rRd = ((aof)localObject1);
            paramInt += 1;
          }
        case 3: 
          localaow.rRg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaow.qZs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaow.qZf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaow.rRh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaow.rRi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localaow.rRf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaow.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */