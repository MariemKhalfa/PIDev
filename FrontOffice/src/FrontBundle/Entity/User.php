<?php
/**
 * Created by PhpStorm.
 * User: Sofien
 * Date: 23/03/2018
 * Time: 00:33
 */

namespace FrontBundle\Entity;
use Doctrine\ORM\Mapping as ORM;
use FOS\UserBundle\Model\User as BaseUser;

/**
 * @ORM\Entity
 * @ORM\Table(name="`user`")
 */
class User extends BaseUser
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     * @ORM\Column(type="integer")
     */protected $id;
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $CIN;
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $nom;
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $prenom;
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $sexe;
    /**
     * @ORM\Column(type="date")
     */
    private $dateNaissance;
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $rue;
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $ville;
    /**
     * @ORM\Column(type="integer")
     */
    private $codePostal;
    /**
     * @ORM\Column(type="integer")
     */
    private $telephone;
    /**
     * @ORM\Column(type="string",nullable=true,length=255)
     */
    private $babysitter;
    /**
     * @ORM\Column(type="string",length=255,nullable=true)
     */
    private $covoiturage;
    /**
     * @ORM\Column(type="string",length=255,nullable=true)
     */
    private $photo="http://www.aesf.fr/public/uploads/profil/default.png";
    /**
     * @ORM\Column(type="string",length=255)
     */
    private $activite='OUI';

    /**
     * @return mixed
     */
    public function getCIN()
    {
        return $this->CIN;
    }

    /**
     * @param mixed $CIN
     */
    public function setCIN($CIN)
    {
        $this->CIN = $CIN;
    }

    /**
     * @return mixed
     */
    public function getDateNaissance()
    {
        return $this->dateNaissance;
    }

    /**
     * @param mixed $dateNaissance
     */
    public function setDateNaissance($dateNaissance)
    {
        $this->dateNaissance = $dateNaissance;
    }

    /**
     * @return mixed
     */
    public function getCodePostal()
    {
        return $this->codePostal;
    }

    /**
     * @param mixed $codePostal
     */
    public function setCodePostal($codePostal)
    {
        $this->codePostal = $codePostal;
    }

    /**
     * @return mixed
     */
    public function getBabysitter()
    {
        return $this->babysitter;
    }

    /**
     * @param mixed $babysitter
     */
    public function setBabysitter($babysitter)
    {
        $this->babysitter = $babysitter;
    }

    /**
     * @return mixed
     */
    public function getActivite()
    {
        return $this->activite;
    }

    /**
     * @param mixed $activite
     */
    public function setActivite($activite)
    {
        $this->activite = $activite;
    }

    /**
     * @return mixed
     */
    public function getSexe()
    {
        return $this->sexe;
    }

    /**
     * @param mixed $sexe
     */
    public function setSexe($sexe)
    {
        $this->sexe = $sexe;
    }

    /**
     * @return mixed
     */
    public function getRue()
    {
        return $this->rue;
    }

    /**
     * @param mixed $rue
     */
    public function setRue($rue)
    {
        $this->rue = $rue;
    }

    /**
     * @return mixed
     */
    public function getCovoiturage()
    {
        return $this->covoiturage;
    }

    /**
     * @param mixed $covoiturage
     */
    public function setCovoiturage($covoiturage)
    {
        $this->covoiturage = $covoiturage;
    }

    /**
     * @return mixed
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @param mixed $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @return mixed
     */
    public function getNom()
    {
        return $this->nom;
    }

    /**
     * @param mixed $nom
     */
    public function setNom($nom)
    {
        $this->nom = $nom;
    }

    /**
     * @return mixed
     */
    public function getPrenom()
    {
        return $this->prenom;
    }

    /**
     * @param mixed $prenom
     */
    public function setPrenom($prenom)
    {
        $this->prenom = $prenom;
    }

    /**
     * @return mixed
     */
    public function getVille()
    {
        return $this->ville;
    }

    /**
     * @param mixed $ville
     */
    public function setVille($ville)
    {
        $this->ville = $ville;
    }

    /**
     * @return mixed
     */
    public function getPhoto()
    {
        return $this->photo;
    }

    /**
     * @param mixed $photo
     */
    public function setPhoto($photo)
    {
        $this->photo = $photo;
    }

    /**
     * @return mixed
     */
    public function getTelephone()
    {
        return $this->telephone;
    }

    /**
     * @param mixed $telephone
     */
    public function setTelephone($telephone)
    {
        $this->telephone = $telephone;
    }


    /**
     * User constructor.
     * @param $id
     */
    public function __construct()
    {
        parent::__construct();
    }
}