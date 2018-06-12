package com.tencent.mm.protocal.c;

public final class arv
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public int group_id;
  public String rTZ;
  public String rUa;
  public String rUb;
  public String rUc;
  public int rUd;
  public int rUe;
  public String rUf;
  public int rUg;
  public int rUh;
  public String rUi;
  public int rUj;
  public int rUk;
  public String rUl;
  public int rUm;
  public int rUn;
  public String rUo;
  public String rUp;
  public String rUq;
  public String rUr;
  public String rqK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      if (this.rTZ != null) {
        paramVarArgs.g(20, this.rTZ);
      }
      if (this.rUa != null) {
        paramVarArgs.g(21, this.rUa);
      }
      if (this.rUb != null) {
        paramVarArgs.g(22, this.rUb);
      }
      if (this.rUc != null) {
        paramVarArgs.g(23, this.rUc);
      }
      if (this.rqK != null) {
        paramVarArgs.g(31, this.rqK);
      }
      paramVarArgs.fT(32, this.rUd);
      paramVarArgs.fT(33, this.rUe);
      if (this.rUf != null) {
        paramVarArgs.g(34, this.rUf);
      }
      paramVarArgs.fT(35, this.rUg);
      paramVarArgs.fT(36, this.rUh);
      if (this.rUi != null) {
        paramVarArgs.g(37, this.rUi);
      }
      paramVarArgs.fT(38, this.rUj);
      paramVarArgs.fT(39, this.rUk);
      if (this.rUl != null) {
        paramVarArgs.g(41, this.rUl);
      }
      paramVarArgs.fT(200, this.rUm);
      paramVarArgs.fT(201, this.rUn);
      paramVarArgs.fT(202, this.group_id);
      if (this.rUo != null) {
        paramVarArgs.g(203, this.rUo);
      }
      if (this.rUp != null) {
        paramVarArgs.g(204, this.rUp);
      }
      if (this.rUq != null) {
        paramVarArgs.g(205, this.rUq);
      }
      if (this.rUr != null) {
        paramVarArgs.g(206, this.rUr);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label1318;
      }
    }
    label1318:
    for (int i = f.a.a.b.b.a.h(1, this.bPS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rTZ != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.rTZ);
      }
      i = paramInt;
      if (this.rUa != null) {
        i = paramInt + f.a.a.b.b.a.h(21, this.rUa);
      }
      paramInt = i;
      if (this.rUb != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.rUb);
      }
      i = paramInt;
      if (this.rUc != null) {
        i = paramInt + f.a.a.b.b.a.h(23, this.rUc);
      }
      paramInt = i;
      if (this.rqK != null) {
        paramInt = i + f.a.a.b.b.a.h(31, this.rqK);
      }
      i = paramInt + f.a.a.a.fQ(32, this.rUd) + f.a.a.a.fQ(33, this.rUe);
      paramInt = i;
      if (this.rUf != null) {
        paramInt = i + f.a.a.b.b.a.h(34, this.rUf);
      }
      i = paramInt + f.a.a.a.fQ(35, this.rUg) + f.a.a.a.fQ(36, this.rUh);
      paramInt = i;
      if (this.rUi != null) {
        paramInt = i + f.a.a.b.b.a.h(37, this.rUi);
      }
      i = paramInt + f.a.a.a.fQ(38, this.rUj) + f.a.a.a.fQ(39, this.rUk);
      paramInt = i;
      if (this.rUl != null) {
        paramInt = i + f.a.a.b.b.a.h(41, this.rUl);
      }
      i = paramInt + f.a.a.a.fQ(200, this.rUm) + f.a.a.a.fQ(201, this.rUn) + f.a.a.a.fQ(202, this.group_id);
      paramInt = i;
      if (this.rUo != null) {
        paramInt = i + f.a.a.b.b.a.h(203, this.rUo);
      }
      i = paramInt;
      if (this.rUp != null) {
        i = paramInt + f.a.a.b.b.a.h(204, this.rUp);
      }
      paramInt = i;
      if (this.rUq != null) {
        paramInt = i + f.a.a.b.b.a.h(205, this.rUq);
      }
      i = paramInt;
      if (this.rUr != null) {
        i = paramInt + f.a.a.b.b.a.h(206, this.rUr);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        arv localarv = (arv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localarv.bPS = locala.vHC.readString();
          return 0;
        case 20: 
          localarv.rTZ = locala.vHC.readString();
          return 0;
        case 21: 
          localarv.rUa = locala.vHC.readString();
          return 0;
        case 22: 
          localarv.rUb = locala.vHC.readString();
          return 0;
        case 23: 
          localarv.rUc = locala.vHC.readString();
          return 0;
        case 31: 
          localarv.rqK = locala.vHC.readString();
          return 0;
        case 32: 
          localarv.rUd = locala.vHC.rY();
          return 0;
        case 33: 
          localarv.rUe = locala.vHC.rY();
          return 0;
        case 34: 
          localarv.rUf = locala.vHC.readString();
          return 0;
        case 35: 
          localarv.rUg = locala.vHC.rY();
          return 0;
        case 36: 
          localarv.rUh = locala.vHC.rY();
          return 0;
        case 37: 
          localarv.rUi = locala.vHC.readString();
          return 0;
        case 38: 
          localarv.rUj = locala.vHC.rY();
          return 0;
        case 39: 
          localarv.rUk = locala.vHC.rY();
          return 0;
        case 41: 
          localarv.rUl = locala.vHC.readString();
          return 0;
        case 200: 
          localarv.rUm = locala.vHC.rY();
          return 0;
        case 201: 
          localarv.rUn = locala.vHC.rY();
          return 0;
        case 202: 
          localarv.group_id = locala.vHC.rY();
          return 0;
        case 203: 
          localarv.rUo = locala.vHC.readString();
          return 0;
        case 204: 
          localarv.rUp = locala.vHC.readString();
          return 0;
        case 205: 
          localarv.rUq = locala.vHC.readString();
          return 0;
        }
        localarv.rUr = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/arv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */