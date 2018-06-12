package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class mo
  extends bhp
{
  public String desc;
  public int hUm;
  public String hUn;
  public String mwO;
  public String rqa;
  public int rqb;
  public LinkedList<Integer> rqc = new LinkedList();
  public int rqf;
  
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
      if (this.mwO != null) {
        paramVarArgs.g(4, this.mwO);
      }
      if (this.rqa != null) {
        paramVarArgs.g(5, this.rqa);
      }
      paramVarArgs.fT(6, this.rqb);
      paramVarArgs.d(7, 2, this.rqc);
      if (this.desc != null) {
        paramVarArgs.g(8, this.desc);
      }
      paramVarArgs.fT(9, this.rqf);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label704;
      }
    }
    label704:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.mwO != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.mwO);
      }
      paramInt = i;
      if (this.rqa != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rqa);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rqb) + f.a.a.a.c(7, 2, this.rqc);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.desc);
      }
      return paramInt + f.a.a.a.fQ(9, this.rqf);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rqc.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        mo localmo = (mo)paramVarArgs[1];
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
            localmo.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmo.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localmo.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localmo.mwO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localmo.rqa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localmo.rqb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localmo.rqc.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 8: 
          localmo.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localmo.rqf = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */