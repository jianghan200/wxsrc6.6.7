package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class i
  extends bhp
{
  public int hUm = 268513600;
  public String hUn = "请求不成功，请稍候再试";
  public String qYc;
  public String qYe;
  public y qYk;
  
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
      if (this.qYc != null) {
        paramVarArgs.g(4, this.qYc);
      }
      if (this.qYe != null) {
        paramVarArgs.g(6, this.qYe);
      }
      if (this.qYk != null)
      {
        paramVarArgs.fV(7, this.qYk.boi());
        this.qYk.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label666;
      }
    }
    label666:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.qYc != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.qYc);
      }
      paramInt = i;
      if (this.qYe != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.qYe);
      }
      i = paramInt;
      if (this.qYk != null) {
        i = paramInt + f.a.a.a.fS(7, this.qYk.boi());
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
        i locali = (i)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5: 
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
            locali.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          locali.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          locali.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locali.qYc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locali.qYe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new y();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((y)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          locali.qYk = ((y)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */