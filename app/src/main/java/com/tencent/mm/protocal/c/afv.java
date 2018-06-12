package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afv
  extends bhp
{
  public String jPK;
  public int qZc;
  public String qZs;
  public String rBM;
  public bhy rIW;
  public int rJI;
  public LinkedList<ays> rJJ = new LinkedList();
  public int rJK;
  public String rJf;
  public int rJg;
  public String rlo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rIW == null) {
        throw new b("Not all required fields were included: Buff");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rJI);
      paramVarArgs.d(3, 8, this.rJJ);
      paramVarArgs.fT(4, this.qZc);
      paramVarArgs.fT(5, this.rJK);
      if (this.rIW != null)
      {
        paramVarArgs.fV(6, this.rIW.boi());
        this.rIW.a(paramVarArgs);
      }
      if (this.jPK != null) {
        paramVarArgs.g(7, this.jPK);
      }
      if (this.rJf != null) {
        paramVarArgs.g(8, this.rJf);
      }
      if (this.rBM != null) {
        paramVarArgs.g(9, this.rBM);
      }
      if (this.qZs != null) {
        paramVarArgs.g(10, this.qZs);
      }
      paramVarArgs.fT(11, this.rJg);
      if (this.rlo != null) {
        paramVarArgs.g(12, this.rlo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1058;
      }
    }
    label1058:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rJI) + f.a.a.a.c(3, 8, this.rJJ) + f.a.a.a.fQ(4, this.qZc) + f.a.a.a.fQ(5, this.rJK);
      paramInt = i;
      if (this.rIW != null) {
        paramInt = i + f.a.a.a.fS(6, this.rIW.boi());
      }
      i = paramInt;
      if (this.jPK != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.jPK);
      }
      paramInt = i;
      if (this.rJf != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rJf);
      }
      i = paramInt;
      if (this.rBM != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rBM);
      }
      paramInt = i;
      if (this.qZs != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.qZs);
      }
      i = paramInt + f.a.a.a.fQ(11, this.rJg);
      paramInt = i;
      if (this.rlo != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rlo);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rJJ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rIW != null) {
          break;
        }
        throw new b("Not all required fields were included: Buff");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        afv localafv = (afv)paramVarArgs[1];
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
            localafv.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafv.rJI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ays();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ays)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafv.rJJ.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localafv.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localafv.rJK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafv.rIW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          localafv.jPK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localafv.rJf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localafv.rBM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localafv.qZs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localafv.rJg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localafv.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/afv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */