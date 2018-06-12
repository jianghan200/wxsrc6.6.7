package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class lx
  extends bhp
{
  public String desc;
  public int hUm;
  public String hUn;
  public String hqp;
  public String hwH;
  public String mwO;
  public String plj;
  public boolean rpZ;
  public String rqa;
  public int rqb;
  public LinkedList<Integer> rqc = new LinkedList();
  public String rqd;
  public int rqe;
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
      paramVarArgs.av(4, this.rpZ);
      if (this.mwO != null) {
        paramVarArgs.g(5, this.mwO);
      }
      if (this.rqa != null) {
        paramVarArgs.g(6, this.rqa);
      }
      if (this.hqp != null) {
        paramVarArgs.g(7, this.hqp);
      }
      paramVarArgs.fT(8, this.rqb);
      if (this.desc != null) {
        paramVarArgs.g(9, this.desc);
      }
      if (this.plj != null) {
        paramVarArgs.g(10, this.plj);
      }
      paramVarArgs.d(11, 2, this.rqc);
      if (this.rqd != null) {
        paramVarArgs.g(12, this.rqd);
      }
      if (this.hwH != null) {
        paramVarArgs.g(13, this.hwH);
      }
      paramVarArgs.fT(14, this.rqe);
      paramVarArgs.fT(15, this.rqf);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1007;
      }
    }
    label1007:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt + (f.a.a.b.b.a.ec(4) + 1);
      paramInt = i;
      if (this.mwO != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.mwO);
      }
      i = paramInt;
      if (this.rqa != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rqa);
      }
      paramInt = i;
      if (this.hqp != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.hqp);
      }
      i = paramInt + f.a.a.a.fQ(8, this.rqb);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.desc);
      }
      i = paramInt;
      if (this.plj != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.plj);
      }
      i += f.a.a.a.c(11, 2, this.rqc);
      paramInt = i;
      if (this.rqd != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rqd);
      }
      i = paramInt;
      if (this.hwH != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.hwH);
      }
      return i + f.a.a.a.fQ(14, this.rqe) + f.a.a.a.fQ(15, this.rqf);
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
        lx locallx = (lx)paramVarArgs[1];
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
            locallx.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          locallx.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          locallx.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locallx.rpZ = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 5: 
          locallx.mwO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locallx.rqa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          locallx.hqp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          locallx.rqb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          locallx.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          locallx.plj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          locallx.rqc.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 12: 
          locallx.rqd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          locallx.hwH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          locallx.rqe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        locallx.rqf = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */