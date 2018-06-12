package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aew
  extends bhp
{
  public int rDj;
  public String rDk;
  public String rDl;
  public int rDm;
  public String rDn;
  public String rIM;
  public String rIN;
  
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
      if (this.rIM != null) {
        paramVarArgs.g(2, this.rIM);
      }
      paramVarArgs.fT(3, this.rDj);
      if (this.rDk != null) {
        paramVarArgs.g(4, this.rDk);
      }
      if (this.rDl != null) {
        paramVarArgs.g(5, this.rDl);
      }
      paramVarArgs.fT(6, this.rDm);
      if (this.rDn != null) {
        paramVarArgs.g(7, this.rDn);
      }
      if (this.rIN != null) {
        paramVarArgs.g(8, this.rIN);
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
      int i = paramInt;
      if (this.rIM != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rIM);
      }
      i += f.a.a.a.fQ(3, this.rDj);
      paramInt = i;
      if (this.rDk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rDk);
      }
      i = paramInt;
      if (this.rDl != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rDl);
      }
      i += f.a.a.a.fQ(6, this.rDm);
      paramInt = i;
      if (this.rDn != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rDn);
      }
      i = paramInt;
      if (this.rIN != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rIN);
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
        aew localaew = (aew)paramVarArgs[1];
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
            localaew.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaew.rIM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaew.rDj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localaew.rDk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaew.rDl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaew.rDm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localaew.rDn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaew.rIN = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */