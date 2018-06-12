package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class mk
  extends bhp
{
  public String desc;
  public int hUm;
  public String hUn;
  public String mxM;
  public String rqB;
  public LinkedList<Integer> rqc = new LinkedList();
  public int rqe;
  public String rqp;
  public String rqs;
  public String rqv;
  public String rqx;
  public String rqy;
  
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
      if (this.rqs != null) {
        paramVarArgs.g(4, this.rqs);
      }
      paramVarArgs.d(5, 2, this.rqc);
      if (this.desc != null) {
        paramVarArgs.g(6, this.desc);
      }
      if (this.rqB != null) {
        paramVarArgs.g(7, this.rqB);
      }
      if (this.mxM != null) {
        paramVarArgs.g(8, this.mxM);
      }
      if (this.rqv != null) {
        paramVarArgs.g(9, this.rqv);
      }
      if (this.rqx != null) {
        paramVarArgs.g(10, this.rqx);
      }
      if (this.rqy != null) {
        paramVarArgs.g(11, this.rqy);
      }
      paramVarArgs.fT(12, this.rqe);
      if (this.rqp != null) {
        paramVarArgs.g(13, this.rqp);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label952;
      }
    }
    label952:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.rqs != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rqs);
      }
      i += f.a.a.a.c(5, 2, this.rqc);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.desc);
      }
      i = paramInt;
      if (this.rqB != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rqB);
      }
      paramInt = i;
      if (this.mxM != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.mxM);
      }
      i = paramInt;
      if (this.rqv != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rqv);
      }
      paramInt = i;
      if (this.rqx != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rqx);
      }
      i = paramInt;
      if (this.rqy != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rqy);
      }
      i += f.a.a.a.fQ(12, this.rqe);
      paramInt = i;
      if (this.rqp != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rqp);
      }
      return paramInt;
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
        mk localmk = (mk)paramVarArgs[1];
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
            localmk.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmk.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localmk.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localmk.rqs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localmk.rqc.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 6: 
          localmk.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localmk.rqB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localmk.mxM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localmk.rqv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localmk.rqx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localmk.rqy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localmk.rqe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localmk.rqp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/mk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */